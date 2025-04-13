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
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Family){
            Family family1=this;
            Family family2=(Family) obj;
            if(family1.sonAge==family1.sonAge && family2.motherAge==family2.motherAge){
                return true;
            }
        }
        return false;
    }
}
