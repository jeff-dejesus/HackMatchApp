package com.example.hackermatcher.Objects;

public class User {
    int id;
    String name;
    String email;
    String school;
    String phone;
    String linkedin;
    String bio;

    public User(String name, String email, String school, String phone, String linkedin, String bio) {
        this.name = name;
        this.email = email;
        this.school = school;
        this.phone = phone;
        this.linkedin = linkedin;
        this.bio = bio;
    }
}
