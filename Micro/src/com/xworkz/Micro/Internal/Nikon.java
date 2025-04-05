package com.xworkz.Micro.Internal;

public class Nikon extends Camera{
    @Override
    public void lens(){
        System.out.println("Lens must be good in camera");
    }
    @Override
    public void focus(){
        System.out.println("Focus must be there while clicking");
    }
    @Override
    public void blur(){
        System.out.println("Camera photos will never blur");
    }
    @Override
    public void click(){
        System.out.println("Camera is used to click photos");
    }
    @Override
    public void quality(){
        System.out.println("Camera qualities must be good");
    }
}
