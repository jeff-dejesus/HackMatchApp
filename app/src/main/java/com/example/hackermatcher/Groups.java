package com.example.hackermatcher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hackermatcher.Objects.Group;

import java.util.ArrayList;

public class Groups extends AppCompatActivity implements View.OnClickListener {

    Button bg1, bg2, bg3, bg4;
    Button groupMaker;
    Button gPrev, gNext;
    TextView gName, gFocus, gMembers, gbio;
    int curr = 0;
    ArrayList<Group> groups = new ArrayList<Group>();

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

        gPrev = findViewById(R.id.gPrev);
        gNext = findViewById(R.id.gNext);
        gPrev.setOnClickListener(this);
        gNext.setOnClickListener(this);

        gName = findViewById(R.id.gName);
        gFocus = findViewById(R.id.gFocus);
        gMembers = findViewById(R.id.gMembers);
        gbio = findViewById(R.id.gBio);

        groups.add(new Group("Hackers", "Javascript", "Bob, Rick", "This is our bio"));
        groups.add(new Group("Ai devs", "machine learning", "Paul, Marcus", "Only cool kids allowed"));
        groups.add(new Group("That one group", "game development", "Henry, Richard", "We are here to get first place and will not sleep at all for the entire hackathon"));
        groups.add(new Group("Full stack devs", "Ai", "Frank, Steve", "We are looking for a person whose good at backend"));

        int curr = (int) (Math.random() * groups.size());
        update(curr);

    }

    void update(int i) {
        gName.setText(groups.get(i).getName());
        gFocus.setText(groups.get(i).getFocus());
        gMembers.setText(groups.get(i).getMembers());
        gbio.setText(groups.get(i).getBio());
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
            case R.id.gPrev:
                curr--;
                if (curr <= -1)
                    curr = groups.size() - 1;
                update(curr);
                break;
            case R.id.gNext:
                curr++;
                if (curr >= groups.size())
                    curr = 0;
                update(curr);
                break;
            default:
                intent = new Intent(this, Users.class);
                break;
        }
        if(intent != null)
            startActivity(intent);
    }
}