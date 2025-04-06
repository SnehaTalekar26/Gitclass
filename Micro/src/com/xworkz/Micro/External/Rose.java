package com.xworkz.Micro.External;

public class Rose extends Plant{
    @Override
    public void grow(){
        System.out.println("Grow the plants");
    }
    @Override
    public void seed(){
        System.out.println("Seed of the plant");
    }
    @Override
    public void dead(){
        System.out.println("Dead plant");
    }
    @Override
    public void tree(){
        System.out.println("Mother of plant");
    }
    @Override
    public void leaves(){
        System.out.println("Leaves are part of plant");
    }
}
