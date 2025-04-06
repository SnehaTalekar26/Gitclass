package com.xworkz.Micro.External;

public class Lawyer extends Court{
    @Override
    public void judge(){
        System.out.println("Judge of Court");
    }
    @Override
    public void law(){
        System.out.println("Laws in Court");
    }
    @Override
    public void rating(){
        System.out.println("Rating of Court");
    }
    @Override
    public void rules(){
        System.out.println("Rules of Court");
    }
    @Override
    public void type(){
        System.out.println("Types of Court");
    }
}
