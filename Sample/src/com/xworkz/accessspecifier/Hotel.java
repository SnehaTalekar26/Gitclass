package com.xworkz.accessspecifier;

public class Hotel {
    public int roomNo=101;
    int capacity=2;
    private String roomType="Suite";

    public void guestroom(){
        System.out.println("Number of the room:"+roomNo);
    }
    void price(){
        System.out.println("Capacity of people staying in room:"+capacity);
    }
    private void bill(){
        System.out.println(roomType);
    }
    void checkBill(){
        System.out.println("Type of room:"+roomType);
    }
}
