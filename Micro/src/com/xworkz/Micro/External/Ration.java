package com.xworkz.Micro.External;

public class Ration extends Shop{
    @Override
    public void visit(){
        System.out.println("Visit the ration");
    }
    @Override
    public void things(){
        System.out.println("Things in ration");
    }
    @Override
    public void place(){
        System.out.println("Place of ration");
    }
    @Override
    public void location(){
        System.out.println("Location of ration");
    }
    @Override
    public void type(){
        System.out.println("Types of ration");
    }
    public void buy(){
        System.out.println("buy some ration");
    }
}
