package com.xworkz.Micro.External;

public class Diamond extends Ring{
    @Override
    public void wear(){
        System.out.println("Wear the ring");
    }
    @Override
    public void design(){
        System.out.println("Choose the design of ring");
    }
    @Override
    public void wash(){
        System.out.println("Wash the ring");
    }
    @Override
    public void color(){
        System.out.println("Color of ring");
    }
    @Override
    public void buy(){
        System.out.println("Buy the ring");
    }
    public void purchase(){
        System.out.println("Purchase the diamond ring");
    }
}
