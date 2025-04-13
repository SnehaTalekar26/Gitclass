package com.xworkz.Task.Internal;

public class SuperPower {
    private String powerName;
    private String type;
    private int intensityLevel;

    public SuperPower(String powerName, String type, int intensityLevel){
        this.powerName = powerName;
        this.type = type;
        this.intensityLevel = intensityLevel;
    }

    @Override
    public String toString(){
        return " Superpower name: " + this.powerName + " ,Type: " + this.type + " ,Intensity Level: " + this.intensityLevel;
    }
    @Override
    public int hashCode(){
        return 13;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof SuperPower){
            SuperPower superPower1=this;
            SuperPower superPower2=(SuperPower) obj;
            if(superPower1.powerName==superPower1.powerName && superPower2.type==superPower2.type){
                return true;
            }
        }
        return false;
    }
}
