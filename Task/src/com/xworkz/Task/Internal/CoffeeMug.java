package com.xworkz.Task.Internal;

public class CoffeeMug {
    private String color;
    private int capacity;
    private boolean hasLid;

    public CoffeeMug(String color, int capacity, boolean hasLid){
        this.color = color;
        this.capacity = capacity;
        this.hasLid = hasLid;
    }

    @Override
    public String toString(){
        return " CoffeeMug color: " + this.color + " ,Capacity: " + this.capacity + "ml ,Has Lid: " + this.hasLid;
    }
}
