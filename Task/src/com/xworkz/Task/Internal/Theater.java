package com.xworkz.Task.Internal;

public class Theater {
    private String movieName;
    private int noOfSeats;
    private boolean is3DAvailable;

    public Theater(String movieName, int noOfSeats, boolean is3DAvailable){
        this.movieName = movieName;
        this.noOfSeats = noOfSeats;
        this.is3DAvailable = is3DAvailable;
    }

    @Override
    public String toString(){
        return " Theater movieName: " + this.movieName + " ,NoOfSeats: " + this.noOfSeats + "Is3DAvailable: " + this.is3DAvailable;
    }
}
