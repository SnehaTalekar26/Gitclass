package com.xworkz.Task.Internal;

public class SuperPower {
    private String powerName;
    private String type;
    private int intensityLevel;

    public SuperPower(String powerName, String type, int intensityLevel){
        this.powerName = powerName;
        this.type = type;
        this.intensityLevel = intensityLevel;
    }

    @Override
    public String toString(){
        return " Superpower name: " + this.powerName + " ,Type: " + this.type + " ,Intensity Level: " + this.intensityLevel;
    }
    @Override
    public int hashCode(){
        return 13;
    }
}
