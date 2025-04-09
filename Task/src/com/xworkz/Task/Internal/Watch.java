package com.xworkz.Task.Internal;

public class Watch {
    private String brand;
    private boolean isDigital;
    private double price;

    public Watch(String brand, boolean isDigital, double price){
        this.brand = brand;
        this.isDigital = isDigital;
        this.price = price;
    }

    @Override
    public String toString(){
        return " Watch brand: " + this.brand + " ,Digital: " + this.isDigital + " ,Price: $" + this.price;
    }
}
