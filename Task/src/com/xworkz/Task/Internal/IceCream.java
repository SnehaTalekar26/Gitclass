package com.xworkz.Task.Internal;

public class IceCream {
    private String flavor;
    private int scoops;
    private boolean hasToppings;

    public IceCream(String flavor, int scoops, boolean hasToppings){
        this.flavor = flavor;
        this.scoops = scoops;
        this.hasToppings = hasToppings;
    }

    @Override
    public String toString(){
        return " IceCream flavor: " + this.flavor + " ,Scoops: " + this.scoops + " ,Toppings: " + this.hasToppings;
    }
    @Override
    public int hashCode(){
        return 476;
    }
}
