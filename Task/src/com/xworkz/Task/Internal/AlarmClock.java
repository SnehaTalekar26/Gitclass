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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof AlarmClock){
            AlarmClock alarmClock1=this;
            AlarmClock alarmClock2=(AlarmClock) obj;
            if(alarmClock1.brand==alarmClock1.brand && alarmClock2.hasSnooze==alarmClock2.hasSnooze){
                return true;
            }
        }
        return false;
    }
}
