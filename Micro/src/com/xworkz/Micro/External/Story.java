package com.xworkz.Micro.External;

public class Story extends History{
    @Override
    public void book(){
        System.out.println("Books of Story");
    }
    @Override
    public void statue(){
        System.out.println("Statues in Story");
    }
    @Override
    public void rating(){
        System.out.println("Rating of Story");
    }
    @Override
    public void people(){
        System.out.println("People of Story");
    }
    @Override
    public void type(){
        System.out.println("Types of Story");
    }
    public void read(){
        System.out.println("read Story");
    }
}
