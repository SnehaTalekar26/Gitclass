package com.xworkz.Micro.External;

public class Casio extends Clock{
    @Override
    public void color(){
        System.out.println("Color of Clock");
    }
    @Override
    public void lens(){
        System.out.println("Lens of Clock");
    }
    @Override
    public void quality(){
        System.out.println("Quality of Clock");
    }
    @Override
    public void duration(){
        System.out.println("Duration of Clock");
    }
    @Override
    public void type(){
        System.out.println("Type of Clock");
    }
    public void price(){
        System.out.println("Price of clock");
    }
}
