package com.xworkz.Task.Internal;

public class Skateboard {
    private String deckMaterial;
    private int wheelSize;
    private boolean isElectric;

    public Skateboard(String deckMaterial, int wheelSize, boolean isElectric){
        this.deckMaterial = deckMaterial;
        this.wheelSize = wheelSize;
        this.isElectric = isElectric;
    }

    @Override
    public String toString(){
        return " Skateboard material: " + this.deckMaterial + " ,Wheel Size: " + this.wheelSize + "mm ,Electric: " + this.isElectric;
    }
}
