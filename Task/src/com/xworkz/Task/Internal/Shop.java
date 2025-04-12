package com.xworkz.Task.Internal;

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
}
