package com.xworkz.Task.Internal;

public class Painting {
    private String title;
    private String artist;
    private String medium;

    public Painting(String title, String artist, String medium){
        this.title = title;
        this.artist = artist;
        this.medium = medium;
    }

    @Override
    public String toString(){
        return " Painting title: " + this.title + " ,Artist: " + this.artist + " ,Medium: " + this.medium;
    }
    @Override
    public int hashCode(){
        return 73;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Painting){
            Painting painting1=this;
            Painting painting2=(Painting)obj;
            if(painting1.title==painting1.title && painting2.artist==painting2.artist){
                return true;
            }
        }
        return false;
    }
}
