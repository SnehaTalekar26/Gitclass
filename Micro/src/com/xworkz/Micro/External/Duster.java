package com.xworkz.Micro.External;

public class Duster extends Board{
    @Override
    public void clean(){
        System.out.println("Clean the duster");
    }
    @Override
    public void write(){
        System.out.println("Write on duster");
    }
    @Override
    public void chalk(){
        System.out.println("Use chalk to write on duster");
    }
    @Override
    public void color(){
        System.out.println("Color of duster");
    }
    @Override
    public void read(){
        System.out.println("Read from the duster");
    }
    public void slate(){
        System.out.println("Slate clean with duster");
    }
}
