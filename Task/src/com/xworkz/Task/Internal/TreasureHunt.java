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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof TreasureHunt){
            TreasureHunt treasureHunt1=this;
            TreasureHunt treasureHunt2=(TreasureHunt) obj;
            if(treasureHunt1.location==treasureHunt1.location && treasureHunt2.clue==treasureHunt2.clue){
                return true;
            }
        }
        return false;
    }
}
