package com.xworkz.Task.Internal;

public class Electricity {
    private int voltage;
    private int current;
    private int circumference;

    public Electricity(int voltage,int current,int circumference){
        this.voltage=voltage;
        this.current=current;
        this.circumference=circumference;
    }

    @Override
    public String toString(){
        return " Electricity voltage:"+this.voltage+" ,Electricity current:"+this.current+" ,Electricity circumference:"+this.circumference;
    }
    @Override
    public int hashCode(){
        return 102;
    }
}
