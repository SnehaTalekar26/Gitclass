package com.xworkz.Task.Internal;

public class WaterBottle {
    private String brand;
    private int capacity;
    private boolean isInsulated;

    public WaterBottle(String brand, int capacity, boolean isInsulated){
        this.brand = brand;
        this.capacity = capacity;
        this.isInsulated = isInsulated;
    }

    @Override
    public String toString(){
        return " WaterBottle brand: " + this.brand + " ,Capacity: " + this.capacity + "ml ,Insulated: " + this.isInsulated;
    }
    @Override
    public int hashCode(){
        return 36;
    }
}
