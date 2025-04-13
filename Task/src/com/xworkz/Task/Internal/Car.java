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
    @Override
    public int hashCode(){
        return 7;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Car){
            Car car1=this;
            Car car2=(Car) obj;
            if(car1.model==car1.model && car2.color==car2.color){
                return true;
            }
        }
        return false;
    }
}
