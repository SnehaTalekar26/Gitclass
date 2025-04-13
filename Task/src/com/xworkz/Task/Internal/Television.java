package com.xworkz.Task.Internal;

public class Television {
    private String brand;
    private int screenSize;
    private boolean isSmart;

    public Television(String brand, int screenSize, boolean isSmart){
        this.brand = brand;
        this.screenSize = screenSize;
        this.isSmart = isSmart;
    }

    @Override
    public String toString(){
        return " Television brand: " + this.brand + " ,Screen Size: " + this.screenSize + " inches ,Smart TV: " + this.isSmart;
    }
    @Override
    public int hashCode(){
        return 22;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Television){
            Television television1=this;
            Television television2=(Television) obj;
            if(television1.brand==television1.brand && television2.screenSize==television2.screenSize){
                return true;
            }
        }
        return false;
    }
}
