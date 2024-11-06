package com.example.plataformavideos;

public class Comment {
    private String username;
    private String content;
    private int likes;
    private Video video;

    public Comment(String username, String content) {
        this.username = username;
        this.content = content;
        this.likes = 0; // Inicializa os likes como 0
    }

    public String getUsername() {
        return username;
    }

    public String getContent() {
        return content;
    }

    public int getLikes() {
        return likes;
    }

    public void like() {
        this.likes++;
    }

    public void setVideo(Video video){
        this.video = video;
    }

    public Video getVideo() {
        return video;
    }
}
