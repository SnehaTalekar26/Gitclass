package com.xworkz.Task.Internal;

public class WashingMachine {
    private String brand;
    private int capacity;
    private boolean isFrontLoad;

    public WashingMachine(String brand, int capacity, boolean isFrontLoad){
        this.brand = brand;
        this.capacity = capacity;
        this.isFrontLoad = isFrontLoad;
    }

    @Override
    public String toString(){
        return " WashingMachine brand: " + this.brand + " ,Capacity: " + this.capacity + "kg ,Front Load: " + this.isFrontLoad;
    }
    @Override
    public int hashCode(){
        return 23;
    }
}
