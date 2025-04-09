package com.xworkz.Task.Internal;

public class Painting {
    private String title;
    private String artist;
    private String medium;

    public Painting(String title, String artist, String medium){
        this.title = title;
        this.artist = artist;
        this.medium = medium;
    }

    @Override
    public String toString(){
        return " Painting title: " + this.title + " ,Artist: " + this.artist + " ,Medium: " + this.medium;
    }
}
