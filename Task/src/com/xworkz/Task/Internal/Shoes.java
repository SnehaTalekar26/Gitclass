package com.xworkz.Task.Internal;

public class Shoes {
    private String brand;
    private String type;
    private int size;

    public Shoes(String brand, String type, int size){
        this.brand = brand;
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString(){
        return " Shoes brand: " + this.brand + " ,Type: " + this.type + " ,Size: " + this.size;
    }
}
