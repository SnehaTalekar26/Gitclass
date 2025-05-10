package com.xworkz.Latent.internal;

public class HouseImpl implements House{
    public HouseImpl(){
        System.out.println("Running HouseImpl const");
    }
    @Override
    public void wall(){
        System.out.println("Running HouseImpl in House");
    }
}
