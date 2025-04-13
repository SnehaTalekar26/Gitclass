package com.xworkz.Task.Internal;

public class Drone {
    private String model;
    private int flightTime;
    private boolean hasCamera;

    public Drone(String model, int flightTime, boolean hasCamera){
        this.model = model;
        this.flightTime = flightTime;
        this.hasCamera = hasCamera;
    }

    @Override
    public String toString(){
        return " Drone model: " + this.model + " ,Flight Time: " + this.flightTime + " mins ,Has Camera: " + this.hasCamera;
    }
    @Override
    public int hashCode(){
        return 97;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Drone){
            Drone drone1=this;
            Drone drone2=(Drone) obj;
            if(drone1.model==drone1.model && drone2.flightTime==drone2.flightTime){
                return true;
            }
        }
        return false;
    }
}
