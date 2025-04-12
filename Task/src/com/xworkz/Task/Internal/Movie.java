package com.xworkz.Task.Internal;

public class Movie {
    private String title;
    private String director;
    private int duration;

    public Movie(String title, String director, int duration){
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    @Override
    public String toString(){
        return " Movie title: " + this.title + " ,Director: " + this.director + " ,Duration: " + this.duration + " mins";
    }
    @Override
    public int hashCode(){
        return 67;
    }
}
