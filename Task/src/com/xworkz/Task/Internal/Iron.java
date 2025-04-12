package com.xworkz.Task.Internal;

public class Iron {
    private String type;
    private int power;
    private boolean hasSteamFunction;

    public Iron(String type, int power, boolean hasSteamFunction){
        this.type = type;
        this.power = power;
        this.hasSteamFunction = hasSteamFunction;
    }

    @Override
    public String toString(){
        return " Iron type: " + this.type + " ,Power: " + this.power + "W ,Steam Function: " + this.hasSteamFunction;
    }
    @Override
    public int hashCode(){
        return 93;
    }
}
