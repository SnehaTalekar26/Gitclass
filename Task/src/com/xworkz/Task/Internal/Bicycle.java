package com.xworkz.Task.Internal;

public class Bicycle {
    private String type;
    private int gearCount;
    private boolean hasBell;

    public Bicycle(String type, int gearCount, boolean hasBell){
        this.type = type;
        this.gearCount = gearCount;
        this.hasBell = hasBell;
    }

    @Override
    public String toString(){
        return " Bicycle type: " + this.type + " ,Gear Count: " + this.gearCount + " ,Has Bell: " + this.hasBell;
    }
    @Override
    public int hashCode(){
        return 108;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Bicycle){
            Bicycle bicycle1=this;
            Bicycle bicycle2=(Bicycle) obj;
            if(bicycle1.type==bicycle1.type && bicycle2.gearCount==bicycle2.gearCount){
                return true;
            }
        }
        return false;
    }
}
