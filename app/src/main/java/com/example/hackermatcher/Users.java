package com.example.hackermatcher;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hackermatcher.Objects.User;

import java.util.ArrayList;


public class Users extends AppCompatActivity implements View.OnClickListener {

    Button bu1, bu2, bu3;

    Button uPrev, uNext;
    TextView userName, userLinkedin, userEmail, userBio;

    ArrayList<User> users = new ArrayList<User>();
    int curr = 0;

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

        uPrev = findViewById(R.id.uPrev);
        uNext = findViewById(R.id.uNext);
        uPrev.setOnClickListener(this);
        uNext.setOnClickListener(this);

        userName = findViewById(R.id.userName);
        userLinkedin = findViewById(R.id.userLinkedin);
        userEmail = findViewById(R.id.userEmail);
        userBio = findViewById(R.id.userBio);

        users.add(new User("Jeff", "email@gmail.com", "Sac State", "123-456-7890", "not-jeff", "this is my biothis is my biothis is my biothis is my biothis is my biothis is my biothis is my biothis is my bio"));
        users.add(new User("Rick", "email@hotmail.com", "Harvard", "999-999-9999", "rick", "my bio"));
        users.add(new User("Ross", "email@hotmail.com", "Harvard", "999-999-9999", "rick", "my bio"));
        users.add(new User("Hank", "email@hotmail.com", "Harvard", "999-999-9999", "rick", "my bio"));
        users.add(new User("Frank", "email@hotmail.com", "Harvard", "999-999-9999", "rick", "my bio"));
        int curr = (int) (Math.random() * users.size());
        update(curr);

    }

    void update(int i) {
        userName.setText(users.get(i).getName());
        userLinkedin.setText(users.get(i).getLinkedin());
        userEmail.setText("Email: " + users.get(i).getEmail());
        userBio.setText(users.get(i).getBio());
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.bu1:
                intent = new Intent(this, Settings.class);
                break;
            case R.id.bu2:
                intent = new Intent(this, Chat.class);
                break;
            case R.id.bu3:
                intent = new Intent(this, Groups.class);
                break;
            case R.id.uNext:
                curr++;
                if (curr >= users.size())
                    curr = 0;
                update(curr);
                break;
            case R.id.uPrev:
                curr--;
                if (curr <= -1)
                    curr = users.size() - 1;
                update(curr);
                break;
            default:
                intent = new Intent(this, MainActivity.class);
                //temp message not actual
        }
        if (intent != null)
            startActivity(intent);
    }
}