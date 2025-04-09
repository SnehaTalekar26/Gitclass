package com.xworkz.Task.Internal;

public class Car {
    private String model;
    private String color;
    private int year;

    public Car(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString(){
        return " Car model: " + this.model + " ,Color: " + this.color + " ,Year: " + this.year;
    }
}
