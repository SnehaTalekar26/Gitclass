package com.xworkz.accessspecifier;

public class Book {
    public int pages=100;
    String type="Ruled";
    private String bookName="Atomic Habits";

    public void read(){
        System.out.println("Pages in book:"+pages);
    }
    void sell(){
        System.out.println("Type of book:"+type);
    }
    private void write(){
        System.out.println(bookName);
    }
    void writeBook(){
        System.out.println("Name of the book:"+bookName);
    }
}
