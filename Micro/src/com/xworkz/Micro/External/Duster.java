package com.xworkz.Micro.External;

public class Duster extends Board{
    @Override
    public void clean(){
        System.out.println("Clean the board");
    }
    @Override
    public void write(){
        System.out.println("Write on board");
    }
    @Override
    public void chalk(){
        System.out.println("Use chalk to write on board");
    }
    @Override
    public void color(){
        System.out.println("Color of board");
    }
    @Override
    public void read(){
        System.out.println("Read from the board");
    }
}
