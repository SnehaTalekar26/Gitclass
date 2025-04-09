package com.xworkz.Task.Internal;

public class Mirror {
    private String shape;
    private String frameMaterial;
    private boolean isWallMounted;

    public Mirror(String shape, String frameMaterial, boolean isWallMounted){
        this.shape = shape;
        this.frameMaterial = frameMaterial;
        this.isWallMounted = isWallMounted;
    }

    @Override
    public String toString(){
        return " Mirror shape: " + this.shape + " ,Frame: " + this.frameMaterial + " ,Wall Mounted: " + this.isWallMounted;
    }
}
