package com.xworkz.Micro.External;

public class DairyMilk extends Chocolate{
    @Override
    public void eat(){
        System.out.println("Eat the chocolate");
    }
    @Override
    public void purchase(){
        System.out.println("Purchase the chocolate");
    }
    @Override
    public void wrapper(){
        System.out.println("Open the wrapper of the chocolate");
    }
    @Override
    public void share(){
        System.out.println("Share the chocolate");
    }
    @Override
    public void flavor(){
        System.out.println("Flavors of chocolates");
    }
    public void taste(){
        System.out.println("Taste is so good");
    }
}
