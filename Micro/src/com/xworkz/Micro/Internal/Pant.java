package com.xworkz.Micro.Internal;

public class Pant extends Clothes{
    @Override
    public void purchase(){
        System.out.println("Purchasing the clothes");
    }
    @Override
    public void sell(){
        System.out.println("Selling the clothes");
    }
    @Override
    public void wear(){
        System.out.println("Wear the clothes");
    }
    @Override
    public void wash(){
        System.out.println("Wash your clothes");
    }
    @Override
    public void trial(){
        System.out.println("Try your clothes");
    }
}
