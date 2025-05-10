package com.xworkz.Task.Internal;

public class TravelBag {
    private String brand;
    private int capacity;
    private boolean isWaterproof;

    public TravelBag(String brand, int capacity, boolean isWaterproof){
        this.brand = brand;
        this.capacity = capacity;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString(){
        return " TravelBag brand: " + this.brand + " ,Capacity: " + this.capacity + "L ,Waterproof: " + this.isWaterproof;
    }
    @Override
    public int hashCode(){
        return 101;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof TravelBag){
            TravelBag travelBag1=this;
            TravelBag travelBag2=(TravelBag) obj;
            if(travelBag1.brand==travelBag1.brand && travelBag2.capacity==travelBag2.capacity){
                return true;
            }
        }
        return false;
    }
}
