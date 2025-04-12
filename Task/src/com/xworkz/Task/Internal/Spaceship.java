package com.xworkz.Task.Internal;

public class Spaceship {
    private String model;
    private int capacity;
    private boolean isInterstellar;

    public Spaceship(String model, int capacity, boolean isInterstellar){
        this.model = model;
        this.capacity = capacity;
        this.isInterstellar = isInterstellar;
    }

    @Override
    public String toString(){
        return " Spaceship model: " + this.model + " ,Capacity: " + this.capacity + " people ,Interstellar: " + this.isInterstellar;
    }
    @Override
    public int hashCode(){
        return 8;
    }
}
