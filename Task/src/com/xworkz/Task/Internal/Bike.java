package com.xworkz.Task.Internal;

public class Bike {
    private String brand;
    private int gearCount;
    private boolean isElectric;

    public Bike(String brand, int gearCount, boolean isElectric){
        this.brand = brand;
        this.gearCount = gearCount;
        this.isElectric = isElectric;
    }

    @Override
    public String toString(){
        return " Bike brand: " + this.brand + " ,Gears: " + this.gearCount + " ,Electric: " + this.isElectric;
    }
    @Override
    public int hashCode(){
        return 14;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Bike){
            Bike bike1=this;
            Bike bike2=(Bike) obj;
            if(bike1.brand==bike1.brand && bike2.gearCount==bike2.gearCount){
                return true;
            }
        }
        return false;
    }
}
