package com.xworkz.Micro.External;

public class Mango extends Juice{
    @Override
    public void drink(){
        System.out.println("Drink the juice");
    }
    @Override
    public void pour(){
        System.out.println("Pour the juice");
    }
    @Override
    public void glass(){
        System.out.println("Pour juice in glass");
    }
    @Override
    public void packet(){
        System.out.println("Packet of juice are available");
    }
    @Override
    public void buy(){
        System.out.println("Buy the juice");
    }
}
