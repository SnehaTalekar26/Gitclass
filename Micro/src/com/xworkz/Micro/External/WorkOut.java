package com.xworkz.Micro.External;

public class WorkOut extends Gym{
    @Override
    public void visit(){
        System.out.println("Visit the WorkOut inGym");
    }
    @Override
    public void dumbbells(){
        System.out.println("Dumbbells in WorkOut inGym");
    }
    @Override
    public void place(){
        System.out.println("Place of WorkOut in Gym");
    }
    @Override
    public void location(){
        System.out.println("Location of WorkOut in Gym");
    }
    @Override
    public void type(){
        System.out.println("Types of WorkOut in gym");
    }
    public void train(){
        System.out.println("training of WorkOut in gym");
    }
}
