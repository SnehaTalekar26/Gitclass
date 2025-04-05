package com.xworkz.Micro.External;

public class Anker extends PowerBank{
    @Override
    public void charge(){
        System.out.println("Charge the PowerBank");
    }
    @Override
    public void recharge(){
        System.out.println("Recharge the PowerBank");
    }
    @Override
    public void connect(){
        System.out.println("Connect the PowerBank");
    }
    @Override
    public void wire(){
        System.out.println("Wire of PowerBank");
    }
    @Override
    public void type(){
        System.out.println("Type of powerBank");
    }
}
