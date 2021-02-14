package com.example.hackermatcher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class GroupMaker extends AppCompatActivity implements View.OnClickListener {

    EditText name, focus, members, bio;
    Button delete, back, save;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.fragment_group_maker);
        name = findViewById(R.id.groupname);
        focus = findViewById(R.id.groupfocus);
        members = findViewById(R.id.groupmembers);
        bio = findViewById(R.id.groupbio);

        delete = findViewById(R.id.groupdel);
        back = findViewById(R.id.groupback);
        save = findViewById(R.id.groupsave);
        delete.setOnClickListener(this);
        back.setOnClickListener(this);
        save.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        String gName = name.getText().toString();
        String gFocus = focus.getText().toString();
        String gMembers = members.getText().toString();
        String gBio = bio.getText().toString();

        Intent intent = new Intent(this, Groups.class);
        switch (v.getId()) {
            case R.id.groupdel:
                //delete group
                break;
            case R.id.groupback:
                //return as normal
                break;
            default:
                break;
                //update group
                //create group if null
        }

        startActivity(intent);
    }
}