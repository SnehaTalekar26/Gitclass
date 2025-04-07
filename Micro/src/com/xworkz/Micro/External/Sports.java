package com.xworkz.Micro.External;

public class Sports extends Athlete{
    @Override
    public void run(){
        System.out.println("Athlete is running in Sports");
    }
    @Override
    public void fit(){
        System.out.println("Athlete needs to be fit in Sports");
    }
    @Override
    public void workout(){
        System.out.println("Athlete must workout in Sports");
    }
    @Override
    public void rules(){
        System.out.println("Rules for athletes will be strict in Sports");
    }
    @Override
    public void type(){
        System.out.println("Types of Sports for athletes");
    }
    public void diet(){
        System.out.println("diet of Sports for athletes");
    }
}
