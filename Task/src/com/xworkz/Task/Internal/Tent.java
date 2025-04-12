package com.xworkz.Task.Internal;

public class Tent {
    private int capacity;
    private String color;
    private boolean isWaterproof;

    public Tent(int capacity, String color, boolean isWaterproof){
        this.capacity = capacity;
        this.color = color;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString(){
        return " Tent capacity: " + this.capacity + " person(s) ,Color: " + this.color + " ,Waterproof: " + this.isWaterproof;
    }
    @Override
    public int hashCode(){
        return 44;
    }
}
