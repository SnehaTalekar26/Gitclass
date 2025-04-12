package com.xworkz.Task.Internal;

public class Internet {
    private int dataUsed;
    private int Speed;
    private int Time;

    public Internet(int dataUsed,int Speed,int Time){
        this.dataUsed=dataUsed;
        this.Speed=Speed;
        this.Time=Time;
    }

    @Override
    public String toString(){
        return " Internet dataUsed:"+this.dataUsed+" ,Internet Speed:"+this.Speed+" ,Internet Time:"+this.Time;
    }
    @Override
    public int hashCode(){
        return 67;
    }
}
