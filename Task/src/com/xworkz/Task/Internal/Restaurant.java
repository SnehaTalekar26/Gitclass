package com.xworkz.Task.Internal;

public class Restaurant {
    private String location;
    private int noOfTables;
    private boolean isVeg;

    public Restaurant(String location, int noOfTables, boolean isVeg){
        this.location = location;
        this.noOfTables = noOfTables;
        this.isVeg = isVeg;
    }

    @Override
    public String toString(){
        return " Restaurant location: " + this.location + " ,NoOfTables: " + this.noOfTables + "IsVeg: " + this.isVeg;
    }
}
