package com.xworkz.Task.Internal;

public class Oven {
    private String brand;
    private int capacity;
    private boolean isConvection;

    public Oven(String brand, int capacity, boolean isConvection){
        this.brand = brand;
        this.capacity = capacity;
        this.isConvection = isConvection;
    }

    @Override
    public String toString(){
        return " Oven brand: " + this.brand + " ,Capacity: " + this.capacity + "L ,Convection: " + this.isConvection;
    }
}
