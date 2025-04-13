package com.xworkz.Task.Internal;

public class Backpack {
    private String brand;
    private int compartments;
    private boolean hasLaptopSlot;

    public Backpack(String brand, int compartments, boolean hasLaptopSlot){
        this.brand = brand;
        this.compartments = compartments;
        this.hasLaptopSlot = hasLaptopSlot;
    }

    @Override
    public String toString(){
        return " Backpack brand: " + this.brand + " ,Compartments: " + this.compartments + " ,Laptop Slot: " + this.hasLaptopSlot;
    }
    @Override
    public int hashCode(){
        return 20;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Backpack){
            Backpack backpack1=this;
            Backpack backpack2=(Backpack) obj;
            if(backpack1.brand==backpack1.brand && backpack2.compartments==backpack2.compartments){
                return true;
            }
        }
        return false;
    }
}
