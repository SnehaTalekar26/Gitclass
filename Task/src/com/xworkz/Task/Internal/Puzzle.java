package com.xworkz.Task.Internal;

public class Puzzle {
    private String name;
    private String level;
    private boolean isChallenging;

    public Puzzle(String name, String level, boolean isChallenging){
        this.name = name;
        this.level = level;
        this.isChallenging = isChallenging;
    }

    @Override
    public String toString(){
        return " Puzzle name: " + this.name + " , Level: " + this.level + " ,Is Challenging: " + this.isChallenging;
    }
}
