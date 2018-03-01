package com.example.demo.model;

public class Vote {
    
    private int likes;
    private int disLikes;
    public Vote() {
        super();
    }
    public Vote(int likes, int disLikes) {
        super();
        this.likes = likes;
        this.disLikes = disLikes;
    }
    public int getLikes() {
        return likes;
    }
    public void setLikes(int likes) {
        this.likes = likes;
    }
    public int getDisLikes() {
        return disLikes;
    }
    public void setDisLikes(int disLikes) {
        this.disLikes = disLikes;
    }
    
    

}
