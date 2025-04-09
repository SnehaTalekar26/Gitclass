package com.xworkz.Task.Internal;

public class Printer {
    private String brand;
    private boolean isColor;
    private int printSpeed;

    public Printer(String brand, boolean isColor, int printSpeed){
        this.brand = brand;
        this.isColor = isColor;
        this.printSpeed = printSpeed;
    }

    @Override
    public String toString(){
        return " Printer brand: " + this.brand + " ,Color Printer: " + this.isColor + " ,Print Speed: " + this.printSpeed + " ppm";
    }
}
