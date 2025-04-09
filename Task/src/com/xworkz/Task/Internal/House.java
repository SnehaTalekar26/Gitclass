package com.xworkz.Task.Internal;

public class House {
    private String address;
    private int numberOfRooms;
    private boolean hasGarage;

    public House(String address, int numberOfRooms, boolean hasGarage){
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.hasGarage = hasGarage;
    }

    @Override
    public String toString(){
        return " House address: " + this.address + " ,Rooms: " + this.numberOfRooms + " ,Garage: " + this.hasGarage;
    }
}
