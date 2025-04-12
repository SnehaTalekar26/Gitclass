package com.xworkz.Task.Internal;

public class Calender {
    private int year;
    private String type;
    private boolean isLeapYear;

    public Calender(int year, String type, boolean isLeapYear){
        this.year = year;
        this.type = type;
        this.isLeapYear = isLeapYear;
    }

    @Override
    public String toString(){
        return " Calendar year: " + this.year + " ,Type: " + this.type + " ,Leap Year: " + this.isLeapYear;
    }
    @Override
    public int hashCode(){
        return 24;
    }
}
