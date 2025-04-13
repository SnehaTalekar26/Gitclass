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
    @Override
    public int hashCode(){
        return 100;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Bank){
            Bank bank1=this;
            Bank bank2=(Bank) obj;
            if(bank1.loan==bank1.loan && bank2.rate==bank2.rate){
                return true;
            }
        }
        return false;
    }
}
