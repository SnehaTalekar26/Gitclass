package com.xworkz.Micro.External;

public class Wooden extends Furniture{
    @Override
    public void sketch(){
        System.out.println("Prepare the sketch for Wooden furniture");
    }
    @Override
    public void build(){
        System.out.println("Build a Wooden furniture");
    }
    @Override
    public void buy(){
        System.out.println("buy the Wooden furniture");
    }
    @Override
    public void sell(){
        System.out.println("Sell the Wooden furniture");
    }
    @Override
    public void scratch(){
        System.out.println("Scratch in a Wooden furniture");
    }
    public void share(){
        System.out.println("share the Wooden furniture");
    }
}
