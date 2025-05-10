package com.xworkz.Latent.internal;

public class LaptopImpl implements Laptop{
    public LaptopImpl(){
        System.out.println("Running LaptopImpl const");
    }
    @Override
    public void process(){
        System.out.println("Running LaptopImpl in Laptop");
    }
}
