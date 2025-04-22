package com.xworkz.Latent.internal;

public class BookImpl implements Book{
    public BookImpl(){
        System.out.println("Running BookImpl const");
    }
    @Override
    public void read(){
        System.out.println("Running BookImpl in Book");
    }
}
