package com.xworkz.Micro.External;

public class Training extends Center{
    @Override
    public void visit(){
        System.out.println("Visit the Center");
    }
    @Override
    public void books(){
        System.out.println("Books in center");
    }
    @Override
    public void place(){
        System.out.println("Place of center");
    }
    @Override
    public void location(){
        System.out.println("Location of center");
    }
    @Override
    public void type(){
        System.out.println("Types of center");
    }
    public void water(){
        System.out.println("Drink water");
    }
}
