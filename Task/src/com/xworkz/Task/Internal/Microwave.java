package com.xworkz.Task.Internal;

public class Microwave {
    private String brand;
    private int power;
    private boolean hasGrillFunction;

    public Microwave(String brand, int power, boolean hasGrillFunction){
        this.brand = brand;
        this.power = power;
        this.hasGrillFunction = hasGrillFunction;
    }

    @Override
    public String toString(){
        return " Microwave brand: " + this.brand + " ,Power: " + this.power + "W ,Grill Function: " + this.hasGrillFunction;
    }
    @Override
    public int hashCode(){
        return 72;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Microwave){
            Microwave microwave1=this;
            Microwave microwave2=(Microwave) obj;
            if(microwave1.brand==microwave1.brand && microwave2.power==microwave2.power){
                return true;
            }
        }
        return false;
    }
}
