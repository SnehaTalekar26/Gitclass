package com.xworkz.Task.Internal;

public class AC {
    private String brand;
    private int tonnage;
    private boolean isInverter;

    public AC(String brand, int tonnage, boolean isInverter){
        this.brand = brand;
        this.tonnage = tonnage;
        this.isInverter = isInverter;
    }

    @Override
    public String toString(){
        return " AirConditioner brand: " + this.brand + " ,Tonnage: " + this.tonnage + " Ton ,Inverter: " + this.isInverter;
    }
}
