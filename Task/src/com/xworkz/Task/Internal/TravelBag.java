package com.xworkz.Task.Internal;

public class TravelBag {
    private String brand;
    private int capacity;
    private boolean isWaterproof;

    public TravelBag(String brand, int capacity, boolean isWaterproof){
        this.brand = brand;
        this.capacity = capacity;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString(){
        return " TravelBag brand: " + this.brand + " ,Capacity: " + this.capacity + "L ,Waterproof: " + this.isWaterproof;
    }
}
