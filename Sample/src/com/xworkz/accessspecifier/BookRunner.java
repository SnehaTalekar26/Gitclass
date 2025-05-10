package com.xworkz.accessspecifier;

public class BookRunner {
    public static void main(String[] args){
        Book book=new Book();
        System.out.println("Running BookRunner");
        book.read();
        book.sell();
        book.writeBook();
    }
}
