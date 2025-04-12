package com.xworkz.Task.Internal;

public class WaterHeater {
    private String brand;
    private int capacity;
    private boolean isInstant;

    public WaterHeater(String brand, int capacity, boolean isInstant){
        this.brand = brand;
        this.capacity = capacity;
        this.isInstant = isInstant;
    }

    @Override
    public String toString(){
        return " WaterHeater brand: " + this.brand + " ,Capacity: " + this.capacity + "L ,Instant: " + this.isInstant;
    }
    @Override
    public int hashCode(){
        return 38;
    }
}
