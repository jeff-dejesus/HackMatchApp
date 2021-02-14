package com.example.hackermatcher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Users extends AppCompatActivity implements View.OnClickListener {
    Button bu1, bu2, bu3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.fragment_users);
        bu1 = findViewById(R.id.bu1);
        bu2 = findViewById(R.id.bu2);
        bu3 = findViewById(R.id.bu3);
        bu1.setOnClickListener(this);
        bu2.setOnClickListener(this);
        bu3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.bu1:
                intent = new Intent(this, Settings.class);
                break;
            case R.id.bu2:
                intent = new Intent(this, Chat.class);
                break;
            case R.id.bu3:
                intent = new Intent(this, Groups.class);
                break;
            default:
                intent = new Intent(this, MainActivity.class);
                //temp message not actual
        }
            startActivity(intent);
    }
}