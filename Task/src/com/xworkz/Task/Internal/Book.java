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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Book){
            Book book1=this;
            Book book2=(Book) obj;
            if(book1.title==book1.title && book2.author==book2.author){
                return true;
            }
        }
        return false;
    }
}
