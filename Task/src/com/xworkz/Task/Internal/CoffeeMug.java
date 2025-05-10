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
    @Override
    public int hashCode(){
        return 71;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof CoffeeMug){
            CoffeeMug coffeeMug1=this;
            CoffeeMug coffeeMug2=(CoffeeMug) obj;
            if(coffeeMug1.color==coffeeMug1.color && coffeeMug2.capacity==coffeeMug2.capacity){
                return true;
            }
        }
        return false;
    }
}
