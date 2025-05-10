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
    @Override
    public int hashCode(){
        return 123;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Geometry){
            Geometry geometry1=this;
            Geometry geometry2=(Geometry) obj;
            if(geometry1.base==geometry1.base && geometry2.height==geometry2.height){
                return true;
            }
        }
        return false;
    }
}
