package com.xworkz.accessspecifier;

public class HotelRunner {
    public static void main(String[] args){
        System.out.println("Running Hotel Runner");
        Hotel hotel=new Hotel();
        hotel.guestroom();
        hotel.price();
        hotel.checkBill();
    }
}
