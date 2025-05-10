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
    @Override
    public int hashCode(){
        return 876;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Planet){
            Planet planet1=this;
            Planet planet2=(Planet) obj;
            if(planet1.name==planet1.name && planet2.gravity==planet2.gravity){
                return true;
            }
        }
        return false;
    }
}
