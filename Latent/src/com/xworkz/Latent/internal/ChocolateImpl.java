package com.xworkz.Latent.internal;

public class ChocolateImpl implements Chocolate{
    public ChocolateImpl(){
        System.out.println("Running ChocolateImpl const");
    }
    @Override
    public void eat(){
        System.out.println("Running ChocolateImpl in Chocolate");
    }
}
