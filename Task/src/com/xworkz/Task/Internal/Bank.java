package com.xworkz.Task.Internal;

public class Bank {
    private int loan;
    private int rate;
    private int time;

    public Bank(int loan,int rate,int time){
        this.loan=loan;
        this.rate=rate;
        this.time=time;
    }

    @Override
    public String toString(){
        return " Bank loan:"+this.loan+" ,Bank rate:"+this.rate+" ,Bank time:"+this.time;
    }
}
