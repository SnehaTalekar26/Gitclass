package com.xworkz.Task.Internal;

public class Mountain {
    private String name;
    private int height;
    private boolean hasSnow;

    public Mountain(String name, int height, boolean hasSnow){
        this.name = name;
        this.height = height;
        this.hasSnow = hasSnow;
    }

    @Override
    public String toString(){
        return " Mountain name: " + this.name + " ,Height: " + this.height + " meters ,Snow Covered: " + this.hasSnow;
    }
    @Override
    public int hashCode(){
        return 874;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Mountain){
            Mountain mountain1=this;
            Mountain mountain2=(Mountain) obj;
            if(mountain1.name==mountain1.name && mountain2.height==mountain2.height){
                return true;
            }
        }
        return false;
    }
}
