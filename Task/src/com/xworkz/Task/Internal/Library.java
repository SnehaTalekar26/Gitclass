package com.xworkz.Task.Internal;

public class Library {
    private String title;
    private int noOfBooks;
    private boolean isOpen;

    public Library(String title, int noOfBooks, boolean isOpen){
        this.title = title;
        this.noOfBooks = noOfBooks;
        this.isOpen = isOpen;
    }

    @Override
    public String toString(){
        return " Library title: " + this.title + " ,NoOfBooks: " + this.noOfBooks + "IsOpen: " + this.isOpen;
    }
}
