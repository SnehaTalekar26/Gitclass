package com.xworkz.Micro.External;

public class Steel extends Gate{
    @Override
    public void put(){
        System.out.println("Put the gate");
    }
    @Override
    public void design(){
        System.out.println("Choose the design of gate");
    }
    @Override
    public void wash(){
        System.out.println("Wash the gate");
    }
    @Override
    public void color(){
        System.out.println("Color of gate");
    }
    @Override
    public void type(){
        System.out.println("Type the gate");
    }
}
