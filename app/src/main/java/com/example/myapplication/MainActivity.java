package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button nextbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextbutton=(Button) findViewById(R.id.submit);
    }
    public void openActivity2(View view)
    {
        Intent intent=new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}