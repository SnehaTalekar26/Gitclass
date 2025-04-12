package com.xworkz.Task.Internal;

public class Family {
    private int sonAge;
    private int motherAge;
    private int fatherAge;

    public Family(int sonAge,int motherAge,int fatherAge){
        this.sonAge=sonAge;
        this.motherAge=motherAge;
        this.fatherAge=fatherAge;
    }

    @Override
    public String toString(){
        return " Family sonAge:"+this.sonAge+" ,Family motherAge:"+this.motherAge+" ,Family fatherAge:"+this.fatherAge;
    }
    @Override
    public int hashCode(){
        return 78;
    }
}
