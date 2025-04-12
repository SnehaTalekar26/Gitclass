package com.xworkz.Task.Internal;

public class Toothbrush {
    private String brand;
    private boolean isElectric;
    private String color;

    public Toothbrush(String brand, boolean isElectric, String color){
        this.brand = brand;
        this.isElectric = isElectric;
        this.color = color;
    }

    @Override
    public String toString(){
        return " Toothbrush brand: " + this.brand + " ,Electric: " + this.isElectric + " ,Color: " + this.color;
    }
    @Override
    public int hashCode(){
        return 609;
    }
}
