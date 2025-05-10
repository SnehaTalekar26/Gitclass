package com.xworkz.Micro.External;

public class Photos extends Photographer{
    @Override
    public void click(){
        System.out.println("Clicks of photos");
    }
    @Override
    public void passion(){
        System.out.println("Passion in Photos");
    }
    @Override
    public void rating(){
        System.out.println("Rating of Photo");
    }
    @Override
    public void followers(){
        System.out.println("Followers of Photo");
    }
    @Override
    public void type(){
        System.out.println("Types of photo");
    }
    public void feedback(){
        System.out.println("feedback of photo");
    }
}
