package com.xworkz.Micro.External;

public class Crime extends Police{
    @Override
    public void respect(){
        System.out.println("Respect the Police");
    }
    @Override
    public void law(){
        System.out.println("Laws for Police");
    }
    @Override
    public void strong(){
        System.out.println("Police are strong at investigating");
    }
    @Override
    public void rules(){
        System.out.println("Rules of Police station");
    }
    @Override
    public void type(){
        System.out.println("Types of police");
    }
    public void illegal(){
        System.out.println("Illegal police somewhere");
    }
}
