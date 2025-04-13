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
    @Override
    public int hashCode(){
        return 89;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Mixer){
            Mixer mixer1=this;
            Mixer mixer2=(Mixer) obj;
            if(mixer1.brand==mixer1.brand && mixer2.speedLevels==mixer2.speedLevels){
                return true;
            }
        }
        return false;
    }
}

