package com.xworkz.Task.Internal;

public class Laptop {
    private String brand;
    private int ram;
    private int storage;

    public Laptop(String brand, int ram, int storage){
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
    }

    @Override
    public String toString(){
        return " Laptop brand:" + this.brand + " ,Laptop RAM:" + this.ram + "GB ,Laptop Storage:" + this.storage + "GB";
    }
    @Override
    public int hashCode(){
        return 78;
    }
}
