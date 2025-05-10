package com.xworkz.Latent.internal;

public class ChargerImpl implements Charger{
    public ChargerImpl(){
        System.out.println("Running ChargerImpl const");
    }
    @Override
    public void charge(){
        System.out.println("Running ChargerImpl in Charger");
    }
}
