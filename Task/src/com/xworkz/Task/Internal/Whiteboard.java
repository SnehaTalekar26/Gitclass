package com.xworkz.Task.Internal;

public class Whiteboard {
    private String size;
    private boolean isMagnetic;
    private String frameMaterial;

    public Whiteboard(String size, boolean isMagnetic, String frameMaterial){
        this.size = size;
        this.isMagnetic = isMagnetic;
        this.frameMaterial = frameMaterial;
    }

    @Override
    public String toString(){
        return " Whiteboard size: " + this.size + " ,Magnetic: " + this.isMagnetic + " ,Frame: " + this.frameMaterial;
    }
    @Override
    public int hashCode(){
        return 31;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Whiteboard){
            Whiteboard whiteboard1=this;
            Whiteboard whiteboard2=(Whiteboard) obj;
            if(whiteboard1.size==whiteboard1.size && whiteboard2.isMagnetic==whiteboard2.isMagnetic){
                return true;
            }
        }
        return false;
    }
}
