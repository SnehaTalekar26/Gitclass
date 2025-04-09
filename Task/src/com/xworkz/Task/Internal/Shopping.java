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
}
