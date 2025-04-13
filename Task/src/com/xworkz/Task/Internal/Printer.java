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
    @Override
    public int hashCode(){
        return 983;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Printer){
            Printer printer1=this;
            Printer printer2=(Printer) obj;
            if(printer1.brand==printer1.brand && printer2.isColor==printer2.isColor){
                return true;
            }
        }
        return false;
    }
}
