package com.xworkz.Micro.External;

public class Cpin extends Charger{
    @Override
    public void current(){
        System.out.println("Need current for charging");
    }
    @Override
    public void phone(){
        System.out.println("Can charge the phone using charger");
    }
    @Override
    public void socket(){
        System.out.println("Socket is necessary for charging");
    }
    @Override
    public void wire(){
        System.out.println("Wire is necessary for charger");
    }
    @Override
    public void connection(){
        System.out.println("Connect is necessary for charging");
    }
}
