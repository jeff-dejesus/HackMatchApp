package com.example.hackermatcher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Chat extends AppCompatActivity implements View.OnClickListener {

    Button bc1, bc2, bc3, bc4;
    EditText msg;
    Button chatsend;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.fragment_chat);
        bc1 = findViewById(R.id.bc1);
        bc2 = findViewById(R.id.bc2);
        bc3 = findViewById(R.id.bc3);
        bc4 = findViewById(R.id.bc4);
        msg = findViewById(R.id.msg);
        chatsend = findViewById(R.id.chatsend);
        bc1.setOnClickListener(this);
        bc2.setOnClickListener(this);
        bc3.setOnClickListener(this);
        bc4.setOnClickListener(this);
        msg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.bc1:
                intent = new Intent(this, Settings.class);
                break;
            case R.id.bc2:
                intent = new Intent(this, Chat.class);
                break;
            case R.id.bc3:
                intent = new Intent(this, Groups.class);
                break;
            case R.id.bc4:
                intent = new Intent(this, Users.class);
                break;
            default:
                //send message
        }
        if(intent != null)
        startActivity(intent);
    }
}