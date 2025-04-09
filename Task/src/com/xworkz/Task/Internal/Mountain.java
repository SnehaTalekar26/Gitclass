package com.xworkz.Task.Internal;

public class Mountain {
    private String name;
    private int height;
    private boolean hasSnow;

    public Mountain(String name, int height, boolean hasSnow){
        this.name = name;
        this.height = height;
        this.hasSnow = hasSnow;
    }

    @Override
    public String toString(){
        return " Mountain name: " + this.name + " ,Height: " + this.height + " meters ,Snow Covered: " + this.hasSnow;
    }
}
