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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Camera){
            Camera camera1=this;
            Camera camera2=(Camera) obj;
            if(camera1.brand==camera1.brand && camera2.megapixels==camera2.megapixels){
                return true;
            }
        }
        return false;
    }
}
