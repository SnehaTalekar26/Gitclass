package com.xworkz.Task.Internal;

public class AC {
    private String brand;
    private int tonnage;
    private boolean isInverter;

    public AC(String brand, int tonnage, boolean isInverter){
        this.brand = brand;
        this.tonnage = tonnage;
        this.isInverter = isInverter;
    }

    @Override
    public String toString(){
        return " AirConditioner brand: " + this.brand + " ,Tonnage: " + this.tonnage + " Ton ,Inverter: " + this.isInverter;
    }
    @Override
    public int hashCode(){
        return 10;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof AC){
            AC ac1=this;
            AC ac2=(AC)obj;
            if(ac1.brand==ac1.brand && ac2.tonnage==ac2.tonnage){
                return true;
            }
        }
        return false;
    }
}
