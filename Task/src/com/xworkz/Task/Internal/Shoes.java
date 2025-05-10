package com.xworkz.Task.Internal;

public class Shoes {
    private String brand;
    private String type;
    private int size;

    public Shoes(String brand, String type, int size){
        this.brand = brand;
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString(){
        return " Shoes brand: " + this.brand + " ,Type: " + this.type + " ,Size: " + this.size;
    }
    @Override
    public int hashCode(){
        return 12;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Shoes){
            Shoes shoes1=this;
            Shoes shoes2=(Shoes) obj;
            if(shoes1.brand==shoes1.brand && shoes2.type==shoes2.type){
                return true;
            }
        }
        return false;
    }
}
