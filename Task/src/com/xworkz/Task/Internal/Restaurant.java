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
    @Override
    public int hashCode(){
        return 76;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Restaurant){
            Restaurant restaurant1=this;
            Restaurant restaurant2=(Restaurant) obj;
            if(restaurant1.location==restaurant1.location && restaurant2.noOfTables==restaurant2.noOfTables){
                return true;
            }
        }
        return false;
    }
}
