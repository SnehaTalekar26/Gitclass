package com.xworkz.Micro.External;

public class Umbrella extends Rain{
    @Override
    public void water(){
        System.out.println("use Umbrella in water");
    }
    @Override
    public void mud(){
        System.out.println("Umbrella saves from wet mud");
    }
    @Override
    public void cloud(){
        System.out.println("Dark clouds use Umbrella");
    }
    @Override
    public void raincoat(){
        System.out.println("Use raincoat or Umbrella");
    }
    @Override
    public void weather(){
        System.out.println("Check weather from under Umbrella");
    }
    public void run(){
        System.out.println("run using Umbrella");
    }
}
