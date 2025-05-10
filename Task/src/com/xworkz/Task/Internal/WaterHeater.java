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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof WaterHeater){
            WaterHeater waterHeater1=this;
            WaterHeater waterHeater2=(WaterHeater) obj;
            if(waterHeater1.brand==waterHeater1.brand && waterHeater2.capacity==waterHeater2.capacity){
                return true;
            }
        }
        return false;
    }
}
