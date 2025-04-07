package com.xworkz.Micro.External;

public class Island extends Beach{
    @Override
    public void swim(){
        System.out.println("Swim in island");
    }
    @Override
    public void run(){
        System.out.println("Run in island");
    }
    @Override
    public void weather(){
        System.out.println("check weather on island");
    }
    @Override
    public void tree(){
        System.out.println("No of trees on island");
    }
    @Override
    public void type(){
        System.out.println("Types of shops in island");
    }
    public void land(){
        System.out.println("land of island");
    }
}
