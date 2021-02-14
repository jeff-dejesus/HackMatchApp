package com.example.hackermatcher;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity implements View.OnClickListener {

    EditText name, email, school, phone, linkedin, bio;
    Button  save;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.fragment_settings);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        school = findViewById(R.id.school);
        phone = findViewById(R.id.phone);
        linkedin = findViewById(R.id.linkedin);
        bio = findViewById(R.id.bio);

        save = findViewById(R.id.settingssave);
        save.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

    }
}