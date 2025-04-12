package com.xworkz.Task.Internal;

public class TreasureHunt {
    private String location;
    private String clue;
    private int difficulty;

    public TreasureHunt(String location, String clue, int difficulty){
        this.location = location;
        this.clue = clue;
        this.difficulty = difficulty;
    }

    @Override
    public String toString(){
        return " TreasureHunt location: " + this.location + " ,Clue: " + this.clue + " ,Difficulty: " + this.difficulty;
    }
    @Override
    public int hashCode(){
        return 9;
    }
}
