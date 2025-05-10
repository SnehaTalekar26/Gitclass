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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Spaceship){
            Spaceship spaceship1=this;
            Spaceship spaceship2=(Spaceship) obj;
            if(spaceship1.model==spaceship1.model && spaceship2.capacity==spaceship2.capacity){
                return true;
            }
        }
        return false;
    }
}
