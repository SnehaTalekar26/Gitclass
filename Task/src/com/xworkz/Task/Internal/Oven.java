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
    @Override
    public int hashCode(){
        return 71;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Oven){
            Oven oven1=this;
            Oven oven2=(Oven)obj;
            if(oven1.brand==oven1.brand && oven2.capacity==oven2.capacity){
                return true;
            }
        }
        return false;
    }
}
