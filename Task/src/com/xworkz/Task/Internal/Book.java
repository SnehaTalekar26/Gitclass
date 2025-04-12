package com.xworkz.Task.Internal;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString(){
        return " Book title: " + this.title + " ,Author: " + this.author + " ,Pages: " + this.pages;
    }
    @Override
    public int hashCode(){
        return 21;
    }
}
