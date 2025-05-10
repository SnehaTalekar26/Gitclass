package com.xworkz.Micro.External;

public class Bluetooth extends Earphone{
    @Override
    public void connect(){
        System.out.println("connect to the device");
    }
    @Override
    public void purchase(){
        System.out.println("purchase the earphone");
    }
    @Override
    public void share(){
        System.out.println("share the earphone");
    }
    @Override
    public void device(){
        System.out.println("device to connect");
    }
    @Override
    public void mobile(){
        System.out.println("Connect to mobile");
    }
    public void wireless(){
        System.out.println("Wireless bluetooth");
    }
}
