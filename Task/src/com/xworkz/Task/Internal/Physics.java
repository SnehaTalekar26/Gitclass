package com.xworkz.Task.Internal;

public class Physics {
    private int distance;
    private int speed;
    private int time;

    public Physics(int distance,int speed,int time){
        this.distance=distance;
        this.speed=speed;
        this.time=time;
    }

    @Override
    public String toString(){
        return " Physics Distance:"+this.distance+" ,Physics Speed:"+this.speed+" ,Physics Time:"+this.time;
    }
    @Override
    public int hashCode(){
        return 87;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Physics){
            Physics physics1=this;
            Physics physics2=(Physics) obj;
            if(physics1.distance==physics1.distance && physics2.speed==physics2.speed){
                return true;
            }
        }
        return false;
    }
}
