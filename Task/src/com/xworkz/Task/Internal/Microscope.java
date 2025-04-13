package com.xworkz.Task.Internal;

import java.rmi.Naming;

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
    @Override
    public int hashCode(){
        return 67;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Microscope){
            Microscope microscope1=this;
            Microscope microscope2=(Microscope) obj;
            if(microscope1.model==microscope1.model && microscope2.magnification==microscope2.magnification){
                return true;
            }
        }
        return false;
    }
}
