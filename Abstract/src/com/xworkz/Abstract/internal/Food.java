package com.xworkz.Abstract.internal;

public abstract class Food {
    String name;
    String type;
    int price;

    Food(String name,String type,int price){
        this.name=name;
        this.type=type;
        this.price=price;
    }
    void foodType(){
        System.out.println("Type: "+type);
    }
}
