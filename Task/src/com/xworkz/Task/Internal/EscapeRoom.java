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
    @Override
    public int hashCode(){
        return 38;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof EscapeRoom){
            EscapeRoom escapeRoom1=this;
            EscapeRoom escapeRoom2=(EscapeRoom) obj;
            if(escapeRoom1.theme==escapeRoom1.theme && escapeRoom2.level==escapeRoom2.level){
                return true;
            }
        }
        return false;
    }
}
