package com.xworkz.Micro.External;

public class Ration extends Shop{
    @Override
    public void visit(){
        System.out.println("Visit the shop");
    }
    @Override
    public void things(){
        System.out.println("Things in shop");
    }
    @Override
    public void place(){
        System.out.println("Place of shop");
    }
    @Override
    public void location(){
        System.out.println("Location of shop");
    }
    @Override
    public void type(){
        System.out.println("Types of shop");
    }
}
