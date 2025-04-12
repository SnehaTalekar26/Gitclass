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
}
