package com.xworkz.Micro.External;

public class Author extends Textbook{
    @Override
    public void read(){
        System.out.println("Read the Textbook");
    }
    @Override
    public void design(){
        System.out.println("Choose the design of textbook");
    }
    @Override
    public void write(){
        System.out.println("Write answers on the pencil");
    }
    @Override
    public void color(){
        System.out.println("Color of textbook");
    }
    @Override
    public void type(){
        System.out.println("Type the textbook");
    }
    public void study(){
        System.out.println("Study the book");
    }
}
