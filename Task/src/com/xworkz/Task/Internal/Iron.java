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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Iron){
            Iron iron1=this;
            Iron iron2=(Iron) obj;
            if(iron1.type==iron1.type && iron2.power==iron2.power){
                return true;
            }
        }
        return false;
    }
}
