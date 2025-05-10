package com.xworkz.Latent.internal;

public class CitizenConstitutionImpl implements Constitution{
    public CitizenConstitutionImpl(){
        System.out.println("Running CitizenConstitutionImpl const");
    }
    @Override
    public void followLaws(){
        System.out.println("Running CitizenConstitutionImpl in Constitution");
    }
}
