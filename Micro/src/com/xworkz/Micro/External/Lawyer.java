package com.xworkz.Micro.External;

public class Lawyer extends Court{
    @Override
    public void judge(){
        System.out.println("Judge of lawyer");
    }
    @Override
    public void law(){
        System.out.println("Laws in lawyer");
    }
    @Override
    public void rating(){
        System.out.println("Rating of lawyer");
    }
    @Override
    public void rules(){
        System.out.println("Rules of lawyer");
    }
    @Override
    public void type(){
        System.out.println("Types of lawyer");
    }
    public void fight(){
        System.out.println("Fight with lawyer");
    }
}
