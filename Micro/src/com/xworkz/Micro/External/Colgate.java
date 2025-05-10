package com.xworkz.Micro.External;

public class Colgate extends Brush{
    @Override
    public void use(){
        System.out.println("Use the brush");
    }
    @Override
    public void purchase(){
        System.out.println("Purchase the brush");
    }
    @Override
    public void wash(){
        System.out.println("Wash the brush");
    }
    @Override
    public void shoes(){
        System.out.println("can wash shoes using brush");
    }
    @Override
    public void clean(){
        System.out.println("Cleans the teeth");
    }
    public void rub(){
        System.out.println("Rub colgate on wound");
    }
}
