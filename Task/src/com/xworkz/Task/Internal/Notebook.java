package com.xworkz.Task.Internal;

public class Notebook {
    private String subject;
    private int pages;
    private boolean isRuled;

    public Notebook(String subject, int pages, boolean isRuled){
        this.subject = subject;
        this.pages = pages;
        this.isRuled = isRuled;
    }

    @Override
    public String toString(){
        return " Notebook subject: " + this.subject + " ,Pages: " + this.pages + " ,Ruled: " + this.isRuled;
    }
    @Override
    public int hashCode(){
        return 124;
    }
}
