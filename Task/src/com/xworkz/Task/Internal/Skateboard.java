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
    @Override
    public int hashCode(){
        return 70;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Skateboard){
            Skateboard skateboard1=this;
            Skateboard skateboard2=(Skateboard) obj;
            if(skateboard1.deckMaterial==skateboard1.deckMaterial && skateboard2.wheelSize==skateboard2.wheelSize){
                return true;
            }
        }
        return false;
    }
}
