package com.xworkz.Micro.External;

public class Jio extends Sim{
    @Override
    public void buy(){
        System.out.println("Buy the jio");
    }
    @Override
    public void sell(){
        System.out.println("Sell the jio");
    }
    @Override
    public void use(){
        System.out.println("Use the jio");
    }
    @Override
    public void connect(){
        System.out.println("Connect the jio to the phone");
    }
    @Override
    public void call(){
        System.out.println("Call using jio card");
    }
    public void cut(){
        System.out.println("Cut the jio sim");
    }
}
