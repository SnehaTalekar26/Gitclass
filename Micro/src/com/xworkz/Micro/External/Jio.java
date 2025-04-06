package com.xworkz.Micro.External;

public class Jio extends Sim{
    @Override
    public void buy(){
        System.out.println("Buy the sim");
    }
    @Override
    public void sell(){
        System.out.println("Sell the sim");
    }
    @Override
    public void use(){
        System.out.println("Use the sim");
    }
    @Override
    public void connect(){
        System.out.println("Connect the sim to the phone");
    }
    @Override
    public void call(){
        System.out.println("Call using sim card");
    }
}
