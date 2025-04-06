package com.xworkz.Micro.External;

public class Umbrella extends Rain{
    @Override
    public void water(){
        System.out.println("Rain water");
    }
    @Override
    public void mud(){
        System.out.println("Wet mud of rain");
    }
    @Override
    public void cloud(){
        System.out.println("Dark clouds in rain");
    }
    @Override
    public void raincoat(){
        System.out.println("Use raincoat in rain");
    }
    @Override
    public void weather(){
        System.out.println("Check weather in rain");
    }
}
