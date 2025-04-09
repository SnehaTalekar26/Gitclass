package com.xworkz.Task.Internal;

public class DreamCatcher {
    private String color;
    private int diameter;
    private boolean isHandmade;

    public DreamCatcher(String color, int diameter, boolean isHandmade){
        this.color = color;
        this.diameter = diameter;
        this.isHandmade = isHandmade;
    }

    @Override
    public String toString(){
        return " DreamCatcher color: " + this.color + " ,Diameter: " + this.diameter + " cm ,Handmade: " + this.isHandmade;
    }
}
