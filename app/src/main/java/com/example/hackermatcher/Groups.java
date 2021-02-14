package com.example.hackermatcher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Groups extends AppCompatActivity implements View.OnClickListener {

    Button bg1, bg2, bg3, bg4;
    Button groupMaker;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.fragment_groups);
        bg1 = findViewById(R.id.bg1);
        bg2 = findViewById(R.id.bg2);
        bg3 = findViewById(R.id.bg3);
        bg4 = findViewById(R.id.bg4);
        bg1.setOnClickListener(this);
        bg2.setOnClickListener(this);
        bg3.setOnClickListener(this);
        bg4.setOnClickListener(this);

        groupMaker = findViewById(R.id.groupmaker);
        groupMaker.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.bg1:
                intent = new Intent(this, Settings.class);
                break;
            case R.id.bg2:
                intent = new Intent(this, Chat.class);
                break;
            case R.id.bc3:
                intent = new Intent(this, Groups.class);
                break;
            case R.id.groupmaker:
                intent = new Intent(this, GroupMaker.class);
                break;
            default:
                intent = new Intent(this, Users.class);
                break;
        }
        if(intent != null)
            startActivity(intent);
    }
}