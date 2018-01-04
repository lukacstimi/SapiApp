package com.example.sayhello.sapiapp;

/**
 * Created by SayHello on 1/3/2018.
 */

public class Post {

    public String title, desc, imageUrl, username;

    public Post(String title, String desc, String imageUrl, String username) {
        this.title = title;
        this.desc = desc;
        this.imageUrl=imageUrl;
        this.username = username;
    }

    public Post() {
    }



}

