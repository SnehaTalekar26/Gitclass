package com.xworkz.Task.Internal;

public class Train {
    private String name;
    private int coaches;
    private boolean isHighSpeed;

    public Train(String name, int coaches, boolean isHighSpeed){
        this.name = name;
        this.coaches = coaches;
        this.isHighSpeed = isHighSpeed;
    }

    @Override
    public String toString(){
        return " Train name: " + this.name + " ,Coaches: " + this.coaches + " ,High Speed: " + this.isHighSpeed;
    }
}
