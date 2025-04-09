package com.xworkz.Task.Internal;

public class Bike {
    private String brand;
    private int gearCount;
    private boolean isElectric;

    public Bike(String brand, int gearCount, boolean isElectric){
        this.brand = brand;
        this.gearCount = gearCount;
        this.isElectric = isElectric;
    }

    @Override
    public String toString(){
        return " Bike brand: " + this.brand + " ,Gears: " + this.gearCount + " ,Electric: " + this.isElectric;
    }
}
