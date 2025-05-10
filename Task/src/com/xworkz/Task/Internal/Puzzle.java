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
    @Override
    public int hashCode(){
        return 3;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Puzzle){
            Puzzle puzzle1=this;
            Puzzle puzzle2=(Puzzle) obj;
            if(puzzle1.name==puzzle1.name && puzzle2.level==puzzle2.level){
                return true;
            }
        }
        return false;
    }
}
