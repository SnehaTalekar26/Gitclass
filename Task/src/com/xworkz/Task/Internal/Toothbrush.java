package com.xworkz.Task.Internal;

public class Toothbrush {
    private String brand;
    private boolean isElectric;
    private String color;

    public Toothbrush(String brand, boolean isElectric, String color){
        this.brand = brand;
        this.isElectric = isElectric;
        this.color = color;
    }

    @Override
    public String toString(){
        return " Toothbrush brand: " + this.brand + " ,Electric: " + this.isElectric + " ,Color: " + this.color;
    }
    @Override
    public int hashCode(){
        return 609;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Toothbrush){
            Toothbrush toothbrush1=this;
            Toothbrush toothbrush2=(Toothbrush) obj;
            if(toothbrush1.brand==toothbrush1.brand && toothbrush2.isElectric==toothbrush2.isElectric){
                return true;
            }
        }
        return false;
    }
}
