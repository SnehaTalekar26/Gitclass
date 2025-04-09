package com.xworkz.Task.Internal;

public class Planet {
    private String name;
    private double gravity;
    private boolean hasLife;

    public Planet(String name, double gravity, boolean hasLife){
        this.name = name;
        this.gravity = gravity;
        this.hasLife = hasLife;
    }

    @Override
    public String toString(){
        return " Planet name: " + this.name + " ,Gravity: " + this.gravity + " HasLife: " + this.hasLife;
    }
}
