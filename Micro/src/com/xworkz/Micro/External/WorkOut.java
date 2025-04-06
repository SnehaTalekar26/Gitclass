package com.xworkz.Micro.External;

public class WorkOut extends Gym{
    @Override
    public void visit(){
        System.out.println("Visit the Gym");
    }
    @Override
    public void dumbbells(){
        System.out.println("Dumbbells in Gym");
    }
    @Override
    public void place(){
        System.out.println("Place of Gym");
    }
    @Override
    public void location(){
        System.out.println("Location of Gym");
    }
    @Override
    public void type(){
        System.out.println("Types of gym");
    }
}
