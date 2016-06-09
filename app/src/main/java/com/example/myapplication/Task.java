package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Task extends AppCompatActivity {

    private static Button bn3,bn4,bn5,bn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);
        onClick2();
        onClick3();
        onClick4();

    }

        public void onClick2() {
            bn3 = (Button) findViewById(R.id.b1);
            bn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent("com.example.myapplication.starttime");
                    startActivity(intent);
                }
            });
        }
    public void onClick3() {
        bn4 = (Button) findViewById(R.id.b2);
        bn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.myapplication.EndTime");
                startActivity(intent);
            }
        });
    }
    public void onClick4() {
        bn5 = (Button) findViewById(R.id.b3);
        bn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.myapplication.Deadline");
                startActivity(intent);
            }
        });
    }
}
