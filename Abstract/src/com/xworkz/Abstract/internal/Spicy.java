package com.xworkz.Abstract.internal;

public class Spicy extends Food{
    Spicy(String name,String type,int price){
        super(name,type,price);
    }
    void displayInfo(){
        System.out.println("Food Name: "+name);
        System.out.println("Food Price: "+price);
    }
}
