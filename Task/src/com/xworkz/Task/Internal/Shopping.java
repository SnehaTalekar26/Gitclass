package com.xworkz.Task.Internal;

public class Shopping {
    private int quantity;
    private int price;
    private int totalCost;

    public Shopping(int quantity,int price,int totalCost){
        this.quantity=quantity;
        this.price=price;
        this.totalCost=totalCost;
    }

    @Override
    public String toString(){
        return " Shopping quantity:"+this.quantity+" ,Shopping price:"+this.price+" ,Shopping totalCost:"+this.totalCost;
    }
    @Override
    public int hashCode(){
        return 86;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Shopping){
            Shopping shopping1=this;
            Shopping shopping2=(Shopping) obj;
            if(shopping1.quantity==shopping1.quantity && shopping2.price==shopping2.price){
                return true;
            }
        }
        return false;
    }
}
