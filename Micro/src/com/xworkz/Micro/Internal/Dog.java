package com.xworkz.Micro.Internal;

public class Dog extends Animals{
    @Override
    public void eat(){
        System.out.println("Animals eat a lot");
    }
    @Override
    public void sleep(){
        System.out.println("Animals cant sleep easily like us");
    }
    @Override
    public void vet(){
        System.out.println("Veterinary doctor looks for the animals wounds");
    }
    @Override
    public void growth(){
        System.out.println("Animals growth of age is less than humans");
    }
    @Override
    public void livingBeings(){
        System.out.println("All animals are living Beings");
    }
}
