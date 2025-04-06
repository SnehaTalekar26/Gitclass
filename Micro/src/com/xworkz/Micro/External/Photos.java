package com.xworkz.Micro.External;

public class Photos extends Photographer{
    @Override
    public void click(){
        System.out.println("Clicks of photographer");
    }
    @Override
    public void passion(){
        System.out.println("Passion in Photographer");
    }
    @Override
    public void rating(){
        System.out.println("Rating of Photographer");
    }
    @Override
    public void followers(){
        System.out.println("Followers of Photographer");
    }
    @Override
    public void type(){
        System.out.println("Types of photography");
    }
}
