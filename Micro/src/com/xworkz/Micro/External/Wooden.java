package com.xworkz.Micro.External;

public class Wooden extends Furniture{
    @Override
    public void sketch(){
        System.out.println("Prepare the sketch for furniture");
    }
    @Override
    public void build(){
        System.out.println("Build a furniture");
    }
    @Override
    public void buy(){
        System.out.println("buy the furniture");
    }
    @Override
    public void sell(){
        System.out.println("Sell the furniture");
    }
    @Override
    public void scratch(){
        System.out.println("Scratch in a furniture");
    }
}
