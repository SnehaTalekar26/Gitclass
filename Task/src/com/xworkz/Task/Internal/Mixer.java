package com.xworkz.Task.Internal;

public class Mixer {
    private String brand;
    private int speedLevels;
    private boolean hasJuicer;

    public Mixer(String brand, int speedLevels, boolean hasJuicer){
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.hasJuicer = hasJuicer;
    }

    @Override
    public String toString(){
        return " Mixer brand: " + this.brand + " ,Speed Levels: " + this.speedLevels + " ,Has Juicer: " + this.hasJuicer;
    }
}
