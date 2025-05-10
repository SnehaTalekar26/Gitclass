package com.xworkz.Micro.Internal;

public class Apsara extends Books{
    @Override
    public void pages(){
        System.out.println("No of pages in Book");
    }
    @Override
    public void type(){
        System.out.println("Type of a book");
    }
    @Override
    public void size(){
        System.out.println("Size of the book");
    }
    @Override
    public void print(){
        System.out.println("Prints in a book");
    }
    @Override
    public void read(){
        System.out.println("Reading the book");
    }
}
