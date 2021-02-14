package com.example.hackermatcher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bm1, bm2, bm3, bm4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bm1 = findViewById(R.id.bm1);
        bm2 = findViewById(R.id.bm2);
        bm3 = findViewById(R.id.bm3);
        bm4 = findViewById(R.id.bm4);
        bm1.setOnClickListener(this);
        bm2 .setOnClickListener(this);
        bm3.setOnClickListener(this);
        bm4 .setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.bm1:
                 intent = new Intent(this, Settings.class);
                break;
            case R.id.bm2:
                 intent = new Intent(this, Chat.class);
                break;
            case R.id.bm3:
                 intent = new Intent(this, Users.class);
                break;
            default:
                 intent = new Intent(this, Groups.class);
        }
        startActivity(intent);
    }
}