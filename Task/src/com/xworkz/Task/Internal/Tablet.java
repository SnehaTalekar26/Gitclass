package com.xworkz.Task.Internal;

import javafx.scene.control.Tab;

public class Tablet {
    private String brand;
    private int screenSize;
    private boolean supportsPen;

    public Tablet(String brand, int screenSize, boolean supportsPen){
        this.brand = brand;
        this.screenSize = screenSize;
        this.supportsPen = supportsPen;
    }

    @Override
    public String toString(){
        return " Tablet brand: " + this.brand + " ,Screen Size: " + this.screenSize + " inches ,Supports Pen: " + this.supportsPen;
    }
    @Override
    public int hashCode(){
        return 11;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Tablet){
            Tablet tablet1=this;
            Tablet tablet2=(Tablet)obj;
            if(tablet1.brand==tablet1.brand && tablet2.screenSize==tablet2.screenSize){
                return true;
            }
        }
        return false;
    }
}
