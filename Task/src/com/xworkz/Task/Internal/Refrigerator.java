package com.xworkz.Task.Internal;

import java.sql.Ref;

public class Refrigerator {
    private String brand;
    private int capacity;
    private boolean hasFreezer;

    public Refrigerator(String brand, int capacity, boolean hasFreezer){
        this.brand = brand;
        this.capacity = capacity;
        this.hasFreezer = hasFreezer;
    }

    @Override
    public String toString(){
        return " Refrigerator brand: " + this.brand + " ,Capacity: " + this.capacity + "L ,Freezer: " + this.hasFreezer;
    }
    @Override
    public int hashCode(){
        return 672;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Refrigerator){
            Refrigerator refrigerator1=this;
            Refrigerator refrigerator2=(Refrigerator) obj;
            if(refrigerator1.brand==refrigerator1.brand && refrigerator2.capacity==refrigerator2.capacity){
                return true;
            }
        }
        return false;
    }
}
