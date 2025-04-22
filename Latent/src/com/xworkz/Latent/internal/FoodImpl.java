package com.xworkz.Latent.internal;

public class FoodImpl implements Food{
    public FoodImpl(){
        System.out.println("Running FoodImpl const");
    }
    @Override
    public void serve(){
        System.out.println("Running FoodImpl in Food");
    }
}
