package com.xworkz.Task.Internal;

import sun.java2d.pipe.AAShapePipe;

public class Shop {
    private String name;
    private int noOfCustomers;
    private boolean isFamous;

    public Shop(String name, int noOfCustomers, boolean isFamous){
        this.name =name;
        this.noOfCustomers = noOfCustomers;
        this.isFamous = isFamous;
    }

    @Override
    public String toString(){
        return " Shop name: " + this.name + " ,NoOfCustomers: " + this.noOfCustomers + "IsFamous: " + this.isFamous;
    }
    @Override
    public int hashCode(){
        return 192;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Shop){
            Shop shop1=this;
            Shop shop2=(Shop)obj;
            if(shop1.name==shop1.name && shop2.noOfCustomers==shop2.noOfCustomers){
                return true;
            }
        }
        return false;
    }
}
