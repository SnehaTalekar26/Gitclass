package com.xworkz.Task.Internal;

public class Pen {
    private String brand;
    private String color;
    private boolean isGel;

    public Pen(String brand, String color, boolean isGel){
        this.brand = brand;
        this.color = color;
        this.isGel = isGel;
    }

    @Override
    public String toString(){
        return " Pen brand: " + this.brand + " ,Color: " + this.color + " ,Gel Pen: " + this.isGel;
    }
    @Override
    public int hashCode(){
        return 873;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Pen){
            Pen pen1=this;
            Pen pen2=(Pen) obj;
            if(pen1.brand==pen1.brand && pen2.color==pen2.color){
                return true;
            }
        }
        return false;
    }
}
