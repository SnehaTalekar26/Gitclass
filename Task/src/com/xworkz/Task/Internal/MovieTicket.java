package com.xworkz.Task.Internal;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName, String seatNumber, double price){
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    @Override
    public String toString(){
        return " MovieTicket for: " + this.movieName + " ,Seat: " + this.seatNumber + " ,Price: ₹" + this.price;
    }
    @Override
    public int hashCode(){
        return 897;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof MovieTicket){
            MovieTicket movieTicket1=this;
            MovieTicket movieTicket2=(MovieTicket) obj;
            if(movieTicket1.movieName==movieTicket1.movieName && movieTicket2.seatNumber==movieTicket2.seatNumber){
                return true;
            }
        }
        return false;
    }
}
