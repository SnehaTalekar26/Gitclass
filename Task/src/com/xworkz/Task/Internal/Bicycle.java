package com.xworkz.Task.Internal;

public class Bicycle {
    private String type;
    private int gearCount;
    private boolean hasBell;

    public Bicycle(String type, int gearCount, boolean hasBell){
        this.type = type;
        this.gearCount = gearCount;
        this.hasBell = hasBell;
    }

    @Override
    public String toString(){
        return " Bicycle type: " + this.type + " ,Gear Count: " + this.gearCount + " ,Has Bell: " + this.hasBell;
    }
}
