package com.hafizzle.rtfit;

import com.google.gson.annotations.SerializedName;

public class Post {

    private int userID;
    private int id;
    private String title;
    @SerializedName("Body")
    private String text;

    public int getUserID() {
        return userID;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
