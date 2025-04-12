package com.xworkz.Task.Internal;

public class Camera {
    private String brand;
    private int megapixels;
    private boolean isDSLR;

    public Camera(String brand, int megapixels, boolean isDSLR){
        this.brand = brand;
        this.megapixels = megapixels;
        this.isDSLR = isDSLR;
    }

    @Override
    public String toString(){
        return " Camera brand: " + this.brand + " ,Megapixels: " + this.megapixels + "MP ,DSLR: " + this.isDSLR;
    }
    @Override
    public int hashCode(){
        return 41;
    }
}
