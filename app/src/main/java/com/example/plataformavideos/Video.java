package com.example.plataformavideos;

public class Video {
    private String title;
    private int thumbnail;

    public Video(String title, int thumbnail) {
        this.title = title;
        this.thumbnail = thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public int getThumbnail() {
        return thumbnail;
    }
}
