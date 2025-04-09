package com.xworkz.Task.Internal;

public class EscapeRoom {
    private String theme;
    private int level;
    private int timeLimit;

    public EscapeRoom(String theme, int level, int timeLimit){
        this.theme = theme;
        this.level = level;
        this.timeLimit = timeLimit;
    }

    @Override
    public String toString(){
        return " EscapeRoom theme: " + this.theme + " ,Level: " + this.level + " ,Time Limit: " + this.timeLimit + " mins";
    }
}
