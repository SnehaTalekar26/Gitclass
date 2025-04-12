package com.xworkz.Task.Internal;

public class Instrument {
    private String name;
    private String type;
    private boolean isElectric;

    public Instrument(String name, String type, boolean isElectric){
        this.name = name;
        this.type = type;
        this.isElectric = isElectric;
    }

    @Override
    public String toString(){
        return " Instrument name: " + this.name + " ,Type: " + this.type + " ,Electric: " + this.isElectric;
    }
    @Override
    public int hashCode(){
        return 786;
    }
}
