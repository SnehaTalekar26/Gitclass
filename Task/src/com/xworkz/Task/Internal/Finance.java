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
}
