package com.xworkz.Task.Internal;

public class Alien {
    private String speciesName;
    private String planetOrigin;
    private int threatLevel;

    public Alien(String speciesName, String planetOrigin, int threatLevel){
        this.speciesName = speciesName;
        this.planetOrigin = planetOrigin;
        this.threatLevel = threatLevel;
    }

    @Override
    public String toString(){
        return " Alien species: " + this.speciesName + " ,Origin: " + this.planetOrigin + " ,Threat Level: " + this.threatLevel;
    }
    @Override
    public int hashCode(){
        return 19;
    }
}
