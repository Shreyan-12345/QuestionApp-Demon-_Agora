package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button nextbutton;
    private Button A,B,C,D;
    private TextView QuestionTV, QuestionNumberTV, oA,oB,oC,oD;
    private ArrayList<QuizModal> list;
    int currentMarks=0, QuestionNumber =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextbutton=(Button) findViewById(R.id.idBtnSubmit);
        A = (Button) findViewById(R.id.idBtnA);
        B = (Button) findViewById(R.id.idBtnA);
        C = (Button) findViewById(R.id.idBtnA);
        D = (Button) findViewById(R.id.idBtnA);
        QuestionTV = findViewById(R.id.idTextQuestionTV);
        QuestionNumberTV = findViewById(R.id.idTextQuestionNumberTV);
        oA = findViewById(R.id.idoA);
        oB = findViewById(R.id.idoB);
        oC = findViewById(R.id.idoC);
        oD = findViewById(R.id.idoD);
    }
    public void openActivity2(View view) {
        Intent intent=new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}