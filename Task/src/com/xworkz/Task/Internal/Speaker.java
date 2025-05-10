package com.xworkz.Task.Internal;

public class Speaker {
    private String brand;
    private int wattage;
    private boolean isBluetooth;

    public Speaker(String brand, int wattage, boolean isBluetooth){
        this.brand = brand;
        this.wattage = wattage;
        this.isBluetooth = isBluetooth;
    }

    @Override
    public String toString(){
        return " Speaker brand: " + this.brand + " ,Wattage: " + this.wattage + "W ,Bluetooth: " + this.isBluetooth;
    }
    @Override
    public int hashCode(){
        return 6;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Speaker){
            Speaker speaker1=this;
            Speaker speaker2=(Speaker) obj;
            if(speaker1.brand==speaker1.brand && speaker2.wattage==speaker2.wattage){
                return true;
            }
        }
        return false;
    }
}
