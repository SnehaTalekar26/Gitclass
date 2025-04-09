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
}
