package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button nextbutton;
    private Button A,B,C,D,Next;
    private TextView QuestionTV, QuestionNumberTV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextbutton=(Button) findViewById(R.id.idBtnSubmit);
    }
    public void openActivity2(View view)
    {
        Intent intent=new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}