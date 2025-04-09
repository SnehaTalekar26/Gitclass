package com.xworkz.Task.Internal;

public class Geometry {
    private int base;
    private int height;
    private int area;

    public Geometry(int base,int height,int area){
        this.base=base;
        this.height=height;
        this.area=area;
    }

    @Override
    public String toString(){
        return " Geometry base:"+this.base+" ,Geometry height:"+this.height+" ,Geometry area:"+this.area;
    }
}
