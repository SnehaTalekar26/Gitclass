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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Salary){
            Salary salary1=this;
            Salary salary2=(Salary)obj;
            if(salary1.base==salary1.base && salary2.bonus==salary2.bonus){
                return true;
            }
        }
        return false;
    }
}
