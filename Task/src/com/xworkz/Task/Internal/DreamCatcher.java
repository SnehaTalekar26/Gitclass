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
    @Override
    public int hashCode(){
        return 66;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof AC){
            DreamCatcher dreamCatcher1=this;
            DreamCatcher dreamCatcher2=(DreamCatcher) obj;
            if(dreamCatcher1.color==dreamCatcher1.color && dreamCatcher2.diameter==dreamCatcher2.diameter){
                return true;
            }
        }
        return false;
    }
}
