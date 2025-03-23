package com.xworkz.references;

public class Room {
    int roomNo;
    String roomType;

    Room(String roomType,int roomNo){
        this.roomNo=roomNo;
        this.roomType=roomType;
    }
    void roomDisplay(){
        System.out.println("Room No:"+this.roomNo);
        System.out.println("Room Type:"+this.roomType);
    }
}