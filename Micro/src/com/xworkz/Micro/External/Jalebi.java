package com.xworkz.Micro.External;

public class Jalebi extends Bakery{
    @Override
    public void visit(){
        System.out.println("Visit the bakery");
    }
    @Override
    public void sweets(){
        System.out.println("Sweets in bakery");
    }
    @Override
    public void place(){
        System.out.println("Place of bakery");
    }
    @Override
    public void location(){
        System.out.println("Location of bakery");
    }
    @Override
    public void type(){
        System.out.println("Types of bakery");
    }
}
