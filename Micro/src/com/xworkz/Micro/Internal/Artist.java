package com.xworkz.Micro.Internal;

public class Artist extends Art{
    @Override
    public void buy(){
        System.out.println("Buying the Art");
    }
    @Override
    public void sell(){
        System.out.println("Selling the Art");
    }
    @Override
    public void frame(){
        System.out.println("Framing the Art");
    }
    @Override
    public void create(){
        System.out.println("Creating the Art");
    }
    @Override
    public void draw(){
        System.out.println("Drawing the same Art");
    }
}
