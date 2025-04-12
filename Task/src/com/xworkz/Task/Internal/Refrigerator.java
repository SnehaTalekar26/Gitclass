package com.xworkz.Task.Internal;

public class Refrigerator {
    private String brand;
    private int capacity;
    private boolean hasFreezer;

    public Refrigerator(String brand, int capacity, boolean hasFreezer){
        this.brand = brand;
        this.capacity = capacity;
        this.hasFreezer = hasFreezer;
    }

    @Override
    public String toString(){
        return " Refrigerator brand: " + this.brand + " ,Capacity: " + this.capacity + "L ,Freezer: " + this.hasFreezer;
    }
    @Override
    public int hashCode(){
        return 672;
    }
}
