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
    @Override
    public int hashCode(){
        return 66;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Theater){
            Theater theater1=this;
            Theater theater2=(Theater) obj;
            if(theater1.movieName==theater1.movieName && theater2.noOfSeats==theater2.noOfSeats){
                return true;
            }
        }
        return false;
    }
}
