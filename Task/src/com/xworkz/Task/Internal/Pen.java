package com.xworkz.Task.Internal;

public class Pen {
    private String brand;
    private String color;
    private boolean isGel;

    public Pen(String brand, String color, boolean isGel){
        this.brand = brand;
        this.color = color;
        this.isGel = isGel;
    }

    @Override
    public String toString(){
        return " Pen brand: " + this.brand + " ,Color: " + this.color + " ,Gel Pen: " + this.isGel;
    }
}
