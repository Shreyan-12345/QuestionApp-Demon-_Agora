package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailsPage extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_page);
        button=(Button)findViewById(R.id.button);
    }
    public void openMainActivity(View view)
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}