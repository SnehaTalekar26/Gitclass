package com.xworkz.Micro.External;

public class Zip extends Jacket{
    @Override
    public void open(){
        System.out.println("Open the jacket");
    }
    @Override
    public void close(){
        System.out.println("Close the jacket");
    }
    @Override
    public void wash(){
        System.out.println("Wash the jacket");
    }
    @Override
    public void borrow(){
        System.out.println("Borrow the jacket");
    }
    @Override
    public void wear(){
        System.out.println("Wear the jacket");
    }
}
