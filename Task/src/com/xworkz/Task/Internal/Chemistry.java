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
}
