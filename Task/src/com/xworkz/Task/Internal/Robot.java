package com.xworkz.Task.Internal;

public class Robot {
    private String name;
    private int batteryLife;
    private boolean hasAI;

    public Robot(String name, int batteryLife, boolean hasAI){
        this.name = name;
        this.batteryLife = batteryLife;
        this.hasAI = hasAI;
    }

    @Override
    public String toString(){
        return " Robot name: " + this.name + " ,Battery Life: " + this.batteryLife + " hours ,AI Enabled: " + this.hasAI;
    }
}
