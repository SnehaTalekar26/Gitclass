package com.xworkz.Task.Internal;

public class Chemistry {
    private int pressure;
    private int volume;
    private int temperature;

    public Chemistry(int pressure,int volume,int temperature){
        this.pressure=pressure;
        this.volume=volume;
        this.temperature=temperature;
    }

    @Override
    public String toString(){
        return " Chemistry pressure:"+this.pressure+" ,Chemistry volume:"+this.volume+" ,Chemistry temperature:"+this.temperature;
    }
    @Override
    public int hashCode(){
        return 8;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Chemistry){
            Chemistry chemistry1=this;
            Chemistry chemistry2=(Chemistry) obj;
            if(chemistry1.pressure==chemistry1.pressure && chemistry2.volume==chemistry2.volume){
                return true;
            }
        }
        return false;
    }
}
