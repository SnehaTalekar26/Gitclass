package com.xworkz.Micro.External;

public class Rose extends Plant{
    @Override
    public void grow(){
        System.out.println("Grow the rose");
    }
    @Override
    public void seed(){
        System.out.println("Seed of the rose");
    }
    @Override
    public void dead(){
        System.out.println("Dead rose");
    }
    @Override
    public void tree(){
        System.out.println("Mother of rose");
    }
    @Override
    public void leaves(){
        System.out.println("Leaves are part of rose");
    }
    public void steam(){
        System.out.println("Steam the rose");
    }
}
