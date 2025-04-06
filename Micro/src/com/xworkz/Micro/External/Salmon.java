package com.xworkz.Micro.External;

public class Salmon extends Fish{
    @Override
    public void eat(){
        System.out.println("Eat the fish");
    }
    @Override
    public void purchase(){
        System.out.println("Purchase the fish");
    }
    @Override
    public void cut(){
        System.out.println("Cut the fish into pieces");
    }
    @Override
    public void dish(){
        System.out.println("Making some good dish of fish");
    }
    @Override
    public void type(){
        System.out.println("Types of fish");
    }
}
