package com.xworkz.Micro.External;

public class Sports extends Athlete{
    @Override
    public void run(){
        System.out.println("Athlete is running");
    }
    @Override
    public void fit(){
        System.out.println("Athlete needs to be fit");
    }
    @Override
    public void workout(){
        System.out.println("Athlete must workout");
    }
    @Override
    public void rules(){
        System.out.println("Rules for athletes will be strict");
    }
    @Override
    public void type(){
        System.out.println("Types of athletes");
    }
}
