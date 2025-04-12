package com.xworkz.Task.Internal;

public class Sunglasses {
    private String brand;
    private String lensColor;
    private boolean isPolarized;

    public Sunglasses(String brand, String lensColor, boolean isPolarized){
        this.brand = brand;
        this.lensColor = lensColor;
        this.isPolarized = isPolarized;
    }

    @Override
    public String toString(){
        return " Sunglasses brand: " + this.brand + " ,Lens Color: " + this.lensColor + " ,Polarized: " + this.isPolarized;
    }
    @Override
    public int hashCode(){
        return 14;
    }
}
