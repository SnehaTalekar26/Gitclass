package com.xworkz.Micro.Internal;

public class Cat extends Animals{
    @Override
    public void eat(){
        System.out.println("Animals eat");
    }
    @Override
    public void sleep(){
        System.out.println("Animals cant easily sleep");
    }
    @Override
    public void vet(){
        System.out.println("Vet doctor looks for the animals wounds");
    }
    @Override
    public void growth(){
        System.out.println("Growth of age is less than humans");
    }
    @Override
    public void livingBeings(){
        System.out.println("All animals are livingBeings");
    }
    public void drink(){
        System.out.println("Drink water");
    }
}
