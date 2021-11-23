package com.example.myquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_true, btn_false, btn_pre, btn_next;
    TextView TV1;
Questions[] questions=new Questions[]{new Questions(R.string.q1,true),
                                      new Questions(R.string.q2,true),
                                      new Questions(R.string.q3,true),
                                      new Questions(R.string.q4,false)};
int cuID=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TV1=findViewById(R.id.txt_quest);
        btn_true = findViewById(R.id.btn_true);
        btn_false = findViewById(R.id.btn_false);
        btn_next = findViewById(R.id.btn_next);
        btn_pre = findViewById(R.id.btn_pre);
        btn_true.setOnClickListener(v -> {
            if (questions[cuID].isTrue()){
                update();
                Toast.makeText(this, "your right", Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(this, "Your Wrong", Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void update(){
        cuID=(cuID+1)%questions.length;
        int rID=questions[cuID].getResId();
        TV1.setText(rID);

    }
}