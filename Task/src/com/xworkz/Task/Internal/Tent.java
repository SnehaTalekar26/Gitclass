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
        return " Tent capacity: " + this.capacity + " ,Color: " + this.color + " ,Waterproof: " + this.isWaterproof;
    }
    @Override
    public int hashCode(){
        return 44;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Tent){
            Tent tent1=this;
            Tent tent2=(Tent)obj;
            if(tent1.capacity==tent1.capacity && tent2.color==tent2.color){
                return true;
            }
        }
        return false;
    }
}
