package com.xworkz.Micro.External;

public class Bluetooth extends Earphone{
    @Override
    public void connect(){
        System.out.println("Connect to the device");
    }
    @Override
    public void purchase(){
        System.out.println("Purchase the earphone");
    }
    @Override
    public void share(){
        System.out.println("Share the earphone");
    }
    @Override
    public void device(){
        System.out.println("Need some device to connect");
    }
    @Override
    public void mobile(){
        System.out.println("Connect to mobile phone");
    }
}
