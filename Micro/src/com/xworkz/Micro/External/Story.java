package com.xworkz.Micro.External;

public class Story extends History{
    @Override
    public void book(){
        System.out.println("Books of History");
    }
    @Override
    public void statue(){
        System.out.println("Statues in History");
    }
    @Override
    public void rating(){
        System.out.println("Rating of History spots");
    }
    @Override
    public void people(){
        System.out.println("People of History");
    }
    @Override
    public void type(){
        System.out.println("Types of history");
    }
}
