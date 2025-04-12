package com.xworkz.Task.Internal;

public class Guitar {
    private String type;
    private int numberOfStrings;
    private String brand;

    public Guitar(String type, int numberOfStrings, String brand){
        this.type = type;
        this.numberOfStrings = numberOfStrings;
        this.brand = brand;
    }

    @Override
    public String toString(){
        return " Guitar type: " + this.type + " ,Strings: " + this.numberOfStrings + " ,Brand: " + this.brand;
    }
    @Override
    public int hashCode(){
        return 79;
    }
}
