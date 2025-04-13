package com.xworkz.Task.Internal;

import sun.security.provider.Sun;

public class Sunglasses {
    private String brand;
    private String lensColor;
    private boolean isPolarized;

    public Sunglasses(String brand, String lensColor, boolean isPolarized){
        this.brand = brand;
        this.lensColor = lensColor;
        this.isPolarized = isPolarized;
    }

    @Override
    public String toString(){
        return " Sunglasses brand: " + this.brand + " ,Lens Color: " + this.lensColor + " ,Polarized: " + this.isPolarized;
    }
    @Override
    public int hashCode(){
        return 14;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Sunglasses){
            Sunglasses sunglasses1=this;
            Sunglasses sunglasses2=(Sunglasses) obj;
            if(sunglasses1.brand==sunglasses1.brand && sunglasses2.lensColor==sunglasses2.lensColor){
                return true;
            }
        }
        return false;
    }
}
