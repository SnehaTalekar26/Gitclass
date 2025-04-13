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
    @Override
    public int hashCode(){
        return 88;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof DreamLog){
            DreamLog dreamLog1=this;
            DreamLog dreamLog2=(DreamLog) obj;
            if(dreamLog1.dreamTitle==dreamLog1.dreamTitle && dreamLog2.mood==dreamLog2.mood){
                return true;
            }
        }
        return false;
    }
}
