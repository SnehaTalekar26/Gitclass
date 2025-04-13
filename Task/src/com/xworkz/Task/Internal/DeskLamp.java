package com.xworkz.Task.Internal;

public class DeskLamp {
    private String color;
    private int brightnessLevel;
    private boolean isRechargeable;

    public DeskLamp(String color, int brightnessLevel, boolean isRechargeable){
        this.color = color;
        this.brightnessLevel = brightnessLevel;
        this.isRechargeable = isRechargeable;
    }

    @Override
    public String toString(){
        return " DeskLamp color: " + this.color + " ,Brightness Level: " + this.brightnessLevel + " ,Rechargeable: " + this.isRechargeable;
    }
    @Override
    public int hashCode(){
        return 60;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof DeskLamp){
            DeskLamp deskLamp1=this;
            DeskLamp deskLamp2=(DeskLamp) obj;
            if(deskLamp1.color==deskLamp1.color && deskLamp2.brightnessLevel==deskLamp2.brightnessLevel){
                return true;
            }
        }
        return false;
    }
}
