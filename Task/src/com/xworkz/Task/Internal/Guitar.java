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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Guitar){
            Guitar guitar1=this;
            Guitar guitar2=(Guitar) obj;
            if(guitar1.brand==guitar1.brand && guitar2.numberOfStrings==guitar2.numberOfStrings){
                return true;
            }
        }
        return false;
    }
}
