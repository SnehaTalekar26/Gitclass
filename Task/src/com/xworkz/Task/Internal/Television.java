package com.xworkz.Task.Internal;

public class Television {
    private String brand;
    private int screenSize;
    private boolean isSmart;

    public Television(String brand, int screenSize, boolean isSmart){
        this.brand = brand;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    @Override
    public String toString(){
        return " Television brand: " + this.brand + " ,Screen Size: " + this.screenSize + " inches ,Smart TV: " + this.isSmart;
    }
    @Override
    public int hashCode(){
        return 22;
    }
}
