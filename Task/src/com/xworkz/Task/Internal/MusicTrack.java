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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof MusicTrack){
            MusicTrack musicTrack1=this;
            MusicTrack musicTrack2=(MusicTrack) obj;
            if(musicTrack1.title==musicTrack1.title && musicTrack2.artist==musicTrack2.artist){
                return true;
            }
        }
        return false;
    }
}
