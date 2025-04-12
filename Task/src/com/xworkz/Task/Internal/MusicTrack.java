package com.xworkz.Task.Internal;

public class MusicTrack {
    private String title;
    private String artist;
    private int duration; // in seconds

    public MusicTrack(String title, String artist, int duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString(){
        return " MusicTrack title: " + this.title + " ,Artist: " + this.artist + " ,Duration: " + this.duration + " seconds";
    }
    @Override
    public int hashCode(){
        return 612;
    }
}
