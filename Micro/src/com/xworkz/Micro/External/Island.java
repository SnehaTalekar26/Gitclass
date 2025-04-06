package com.xworkz.Micro.External;

public class Island extends Beach{
    @Override
    public void swim(){
        System.out.println("Swim in beach");
    }
    @Override
    public void run(){
        System.out.println("Run in beach");
    }
    @Override
    public void weather(){
        System.out.println("check weather on beach");
    }
    @Override
    public void tree(){
        System.out.println("No of trees on beach");
    }
    @Override
    public void type(){
        System.out.println("Types of shops in beach");
    }
}
