package com.example.hackermatcher.Objects;

public class Group {
    int id;
    String name;
    String focus;
    String members;
    String bio;

    public Group(String name, String focus, String members, String bio) {
        this.name = name;
        this.focus = focus;
        this.members = members;
        this.bio = bio;
    }
}
