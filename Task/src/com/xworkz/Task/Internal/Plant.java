package com.xworkz.Task.Internal;

public class Plant {
    private String species;
    private int height;
    private boolean isIndoor;

    public Plant(String species, int height, boolean isIndoor){
        this.species = species;
        this.height = height;
        this.isIndoor = isIndoor;
    }

    @Override
    public String toString(){
        return " Plant species: " + this.species + " ,Height: " + this.height + " cm ,Indoor: " + this.isIndoor;
    }
    @Override
    public int hashCode(){
        return 2;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Plant){
            Plant plant1=this;
            Plant plant2=(Plant) obj;
            if(plant1.species==plant1.species && plant2.height==plant2.height){
                return true;
            }
        }
        return false;
    }
}
