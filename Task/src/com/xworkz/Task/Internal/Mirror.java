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
    @Override
    public int hashCode(){
        return 987;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Mirror){
            Mirror mirror1=this;
            Mirror mirror2=(Mirror) obj;
            if(mirror1.shape==mirror1.shape && mirror2.frameMaterial==mirror2.frameMaterial){
                return true;
            }
        }
        return false;
    }
}
