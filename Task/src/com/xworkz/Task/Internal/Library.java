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
    @Override
    public int hashCode(){
        return 46;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Library){
            Library library1=this;
            Library library2=(Library) obj;
            if(library1.title==library1.title && library2.noOfBooks==library2.noOfBooks){
                return true;
            }
        }
        return false;
    }
}
