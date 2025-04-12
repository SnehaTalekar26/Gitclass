package com.xworkz.Task.Internal;

public class Cooker {
    private String type;
    private int capacity;
    private boolean isElectric;

    public Cooker(String type, int capacity, boolean isElectric){
        this.type = type;
        this.capacity = capacity;
        this.isElectric = isElectric;
    }

    @Override
    public String toString(){
        return " Cooker type: " + this.type + " ,Capacity: " + this.capacity + " L ,Electric: " + this.isElectric;
    }
    @Override
    public int hashCode(){
        return 30;
    }
}
