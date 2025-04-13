package com.xworkz.Task.Internal;

public class Watch {
    private String brand;
    private boolean isDigital;
    private double price;

    public Watch(String brand, boolean isDigital, double price){
        this.brand = brand;
        this.isDigital = isDigital;
        this.price = price;
    }

    @Override
    public String toString(){
        return " Watch brand: " + this.brand + " ,Digital: " + this.isDigital + " ,Price: $" + this.price;
    }
    @Override
    public int hashCode(){
        return 62;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Watch){
            Watch watch1=this;
            Watch watch2=(Watch) obj;
            if(watch1.brand==watch1.brand && watch2.isDigital==watch2.isDigital){
                return true;
            }
        }
        return false;
    }
}
