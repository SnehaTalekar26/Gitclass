package com.xworkz.Micro.Internal;

public class Artist extends Art{
    @Override
    public void buy(){
        System.out.println("Buying the Art of Artist");
    }
    @Override
    public void sell(){
        System.out.println("Selling the Art of Artist");
    }
    @Override
    public void frame(){
        System.out.println("Framing the Art of Artist");
    }
    @Override
    public void create(){
        System.out.println("Creating the Art of Artist");
    }
    @Override
    public void draw(){
        System.out.println("Drawing the same Art of Artist");
    }
    public void redraw(){
        System.out.println("Re-Drawing the same Art of Artist");
    }
}
