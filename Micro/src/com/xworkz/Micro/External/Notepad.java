package com.xworkz.Micro.External;

public class Notepad extends WritingPad{
    @Override
    public void use(){
        System.out.println("Use the notepad");
    }
    @Override
    public void design(){
        System.out.println("Choose the design of notepad");
    }
    @Override
    public void clean(){
        System.out.println("Clean the notepad");
    }
    @Override
    public void color(){
        System.out.println("Color of notepad");
    }
    @Override
    public void type(){
        System.out.println("Type the notepad");
    }
    public void write(){
        System.out.println("write in the notepad");
    }
}
