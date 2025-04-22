package com.xworkz.Latent.internal;

public class BagImpl implements Bag{
    public BagImpl(){
        System.out.println("Running BagImpl const");
    }
    @Override
    public void zip(){
        System.out.println("Running BagImpl in Bag");
    }
}
