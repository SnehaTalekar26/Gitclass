package com.xworkz.Task.Internal;

public class Monster {
    private String name;
    private int scareLevel;
    private boolean hasWings;

    public Monster(String name, int scareLevel, boolean hasWings){
        this.name = name;
        this.scareLevel = scareLevel;
        this.hasWings = hasWings;
    }

    @Override
    public String toString(){
        return " Monster name: " + this.name + " ,Scare Level: " + this.scareLevel + " ,Has Wings: " + this.hasWings;
    }
}
