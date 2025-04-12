package com.xworkz.Task.Internal;

public class Song {
    private String name;
    private String artist;
    private int duration;

    public Song(String name, String artist, int duration){
        this.name = name;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString(){
        return " Song name: " + this.name + " ,Artist: " + this.artist + " ,Duration: " + this.duration + " mins";
    }
    @Override
    public int hashCode(){
        return 9;
    }
}
