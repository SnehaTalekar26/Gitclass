package com.xworkz.Task.Internal;

public class AlarmClock {
    private String brand;
    private boolean hasSnooze;
    private String displayType;

    public AlarmClock(String brand, boolean hasSnooze, String displayType){
        this.brand = brand;
        this.hasSnooze = hasSnooze;
        this.displayType = displayType;
    }

    @Override
    public String toString(){
        return " AlarmClock brand: " + this.brand + " ,Snooze Feature: " + this.hasSnooze + " ,Display Type: " + this.displayType;
    }
    @Override
    public int hashCode(){
        return 1;
    }
}
