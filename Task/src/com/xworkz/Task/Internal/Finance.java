package com.xworkz.Task.Internal;

public class Finance {
    private int amount;
    private int interest;
    private int duration;

    public Finance(int amount, int interest, int duration){
        this.amount = amount;
        this.interest = interest;
        this.duration = duration;
    }

    @Override
    public String toString(){
        return " Finance amount:" + this.amount + " ,Finance interest:" + this.interest + " ,Finance duration:" + this.duration;
    }
    @Override
    public int hashCode(){
        return 122;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Finance){
            Finance finance1=this;
            Finance finance2=(Finance) obj;
            if(finance1.amount==finance1.amount && finance2.interest==finance2.interest){
                return true;
            }
        }
        return false;
    }
}
