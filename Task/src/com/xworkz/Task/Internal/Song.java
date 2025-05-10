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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Song){
            Song song1=this;
            Song song2=(Song)obj;
            if(song1.name==song1.name && song2.artist==song2.artist){
                return true;
            }
        }
        return false;
    }
}
