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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Electricity){
            Electricity electricity1=this;
            Electricity electricity2=(Electricity) obj;
            if(electricity1.voltage==electricity1.voltage && electricity2.current==electricity2.current){
                return true;
            }
        }
        return false;
    }
}
