package com.xworkz.Task.Internal;

public class HeadPhones {
    private String brand;
    private boolean isWireless;
    private int batteryLife;

    public HeadPhones(String brand, boolean isWireless, int batteryLife){
        this.brand = brand;
        this.isWireless = isWireless;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString(){
        return " Headphones brand: " + this.brand + " ,Wireless: " + this.isWireless + " ,Battery Life: " + this.batteryLife + " hrs";
    }
    @Override
    public int hashCode(){
        return 84;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof HeadPhones){
            HeadPhones headPhones1=this;
            HeadPhones headPhones2=(HeadPhones) obj;
            if(headPhones1.brand==headPhones1.brand && headPhones2.isWireless==headPhones2.isWireless){
                return true;
            }
        }
        return false;
    }
}
