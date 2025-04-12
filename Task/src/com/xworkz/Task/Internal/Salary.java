package com.xworkz.Task.Internal;

public class Salary {
    private int base;
    private int bonus;
    private int total;

    public Salary(int base,int bonus,int total){
        this.base=base;
        this.bonus=bonus;
        this.total=total;
    }

    @Override
    public String toString(){
        return " Salary base:"+this.base+" ,Salary bonus:"+this.bonus+" ,Salary total:"+this.total;
    }
    @Override
    public int hashCode(){
        return 82;
    }
}
