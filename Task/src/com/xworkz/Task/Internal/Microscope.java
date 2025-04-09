package com.xworkz.Task.Internal;

public class Microscope {
    private String model;
    private int magnification;
    private boolean isDigital;

    public Microscope(String model, int magnification, boolean isDigital){
        this.model = model;
        this.magnification = magnification;
        this.isDigital = isDigital;
    }

    @Override
    public String toString(){
        return " Microscope model: " + this.model + " ,Magnification: " + this.magnification + "x ,Digital: " + this.isDigital;
    }
}
