package com.xworkz.Task.Internal;

public class Tablet {
    private String brand;
    private int screenSize;
    private boolean supportsPen;

    public Tablet(String brand, int screenSize, boolean supportsPen){
        this.brand = brand;
        this.screenSize = screenSize;
        this.supportsPen = supportsPen;
    }

    @Override
    public String toString(){
        return " Tablet brand: " + this.brand + " ,Screen Size: " + this.screenSize + " inches ,Supports Pen: " + this.supportsPen;
    }
    @Override
    public int hashCode(){
        return 11;
    }
}
