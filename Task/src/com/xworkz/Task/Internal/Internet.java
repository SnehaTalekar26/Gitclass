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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Internet){
            Internet internet1=this;
            Internet internet2=(Internet) obj;
            if(internet1.dataUsed==internet1.dataUsed && internet2.Speed==internet2.Speed){
                return true;
            }
        }
        return false;
    }
}
