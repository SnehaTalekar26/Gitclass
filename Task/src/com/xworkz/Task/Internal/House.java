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
    @Override
    public int hashCode(){
        return 26;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof House){
            House house1=this;
            House house2=(House) obj;
            if(house1.address==house1.address && house2.numberOfRooms==house2.numberOfRooms){
                return true;
            }
        }
        return false;
    }
}
