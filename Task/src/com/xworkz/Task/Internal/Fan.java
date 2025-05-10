package com.xworkz.Task.Internal;

public class Fan {
    private String brand;
    private int speedLevels;
    private boolean isCeilingFan;

    public Fan(String brand, int speedLevels, boolean isCeilingFan){
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.isCeilingFan = isCeilingFan;
    }

    @Override
    public String toString(){
        return " Fan brand: " + this.brand + " ,Speed Levels: " + this.speedLevels + " ,Ceiling Fan: " + this.isCeilingFan;
    }
    @Override
    public int hashCode(){
        return 64;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Fan){
            Fan fan1=this;
            Fan fan2=(Fan) obj;
            if(fan1.brand==fan1.brand && fan2.speedLevels==fan2.speedLevels){
                return true;
            }
        }
        return false;
    }
}
