package com.xworkz.Micro.External;

public class Campus extends College{
    @Override
    public void construction(){
        System.out.println("Construction of College");
    }
    @Override
    public void lecturers(){
        System.out.println("Lecturers in College");
    }
    @Override
    public void rating(){
        System.out.println("Rating of College");
    }
    @Override
    public void students(){
        System.out.println("Students in College");
    }
    @Override
    public void library(){
        System.out.println("Library of College");
    }
    public void read(){
        System.out.println("Read in campus");
    }
}
