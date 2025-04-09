package com.xworkz.Task.Internal;

public class DreamLog {
    private String dreamTitle;
    private String mood;
    private int duration;

    public DreamLog(String dreamTitle, String mood, int duration){
        this.dreamTitle = dreamTitle;
        this.mood = mood;
        this.duration = duration;
    }

    @Override
    public String toString(){
        return " DreamLog title: " + this.dreamTitle + " ,Mood: " + this.mood + " ,Duration: " + this.duration + " mins";
    }
}
