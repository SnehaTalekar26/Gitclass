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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Alien){
            Alien alien1=this;
            Alien alien2=(Alien) obj;
            if(alien1.speciesName==alien1.speciesName && alien2.planetOrigin==alien2.planetOrigin){
                return true;
            }
        }
        return false;
    }
}
