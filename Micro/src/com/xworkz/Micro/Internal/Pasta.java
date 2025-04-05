package com.xworkz.Micro.Internal;

public class Pasta extends Food{
    @Override
    public void cook(){
        System.out.println("Cooking the food");
    }
    @Override
    public void decorate(){
        System.out.println("Decorating the food");
    }
    @Override
    public void taste(){
        System.out.println("Tasting the food");
    }
    @Override
    public void eat(){
        System.out.println("Eating the food");
    }
    @Override
    public void rate(){
        System.out.println("Rating the food");
    }
}
