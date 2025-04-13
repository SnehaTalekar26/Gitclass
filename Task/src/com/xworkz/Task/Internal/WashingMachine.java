package com.xworkz.Task.Internal;

public class WashingMachine {
    private String brand;
    private int capacity;
    private boolean isFrontLoad;

    public WashingMachine(String brand, int capacity, boolean isFrontLoad){
        this.brand = brand;
        this.capacity = capacity;
        this.isFrontLoad = isFrontLoad;
    }

    @Override
    public String toString(){
        return " WashingMachine brand: " + this.brand + " ,Capacity: " + this.capacity + "kg ,Front Load: " + this.isFrontLoad;
    }
    @Override
    public int hashCode(){
        return 23;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof WashingMachine){
            WashingMachine washingMachine1=this;
            WashingMachine washingMachine2=(WashingMachine) obj;
            if(washingMachine1.brand==washingMachine1.brand && washingMachine2.capacity==washingMachine2.capacity){
                return true;
            }
        }
        return false;
    }
}
