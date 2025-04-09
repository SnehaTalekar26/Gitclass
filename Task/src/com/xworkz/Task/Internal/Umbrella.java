package com.xworkz.Task.Internal;

public class Umbrella {
    private String color;
    private boolean isAutomatic;
    private int size;

    public Umbrella(String color, boolean isAutomatic, int size){
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.size = size;
    }

    @Override
    public String toString(){
        return " Umbrella color: " + this.color + " ,Automatic: " + this.isAutomatic + " ,Size: " + this.size + " inches";
    }
}
