package com.xworkz.Micro.External;

public class Notepad extends WritingPad{
    @Override
    public void use(){
        System.out.println("Use the writingPad");
    }
    @Override
    public void design(){
        System.out.println("Choose the design of WritingPad");
    }
    @Override
    public void clean(){
        System.out.println("Clean the writingPad");
    }
    @Override
    public void color(){
        System.out.println("Color of writingPad");
    }
    @Override
    public void type(){
        System.out.println("Type the writingPad");
    }
}
