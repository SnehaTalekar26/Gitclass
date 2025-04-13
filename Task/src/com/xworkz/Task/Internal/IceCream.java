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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof IceCream){
            IceCream iceCream1=this;
            IceCream iceCream2=(IceCream) obj;
            if(iceCream1.flavor==iceCream1.flavor && iceCream2.scoops==iceCream2.scoops){
                return true;
            }
        }
        return false;
    }
}
