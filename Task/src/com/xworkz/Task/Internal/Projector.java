package com.xworkz.Task.Internal;

public class Projector {
    private String resolution;
    private int brightness;
    private boolean isPortable;

    public Projector(String resolution, int brightness, boolean isPortable){
        this.resolution = resolution;
        this.brightness = brightness;
        this.isPortable = isPortable;
    }

    @Override
    public String toString(){
        return " Projector resolution: " + this.resolution + " ,Brightness: " + this.brightness + " lumens ,Portable: " + this.isPortable;
    }
    @Override
    public int hashCode(){
        return 83;
    }
}
