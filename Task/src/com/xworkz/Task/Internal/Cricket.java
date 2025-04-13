package com.xworkz.Task.Internal;

public class Cricket {
    private int runs;
    private int balls;
    private int strikeRate;

    public Cricket(int runs,int balls,int strikeRate){
        this.runs=runs;
        this.balls=balls;
        this.strikeRate=strikeRate;
    }

    @Override
    public String toString(){
        return " Cricket runs:"+this.runs+" ,Cricket balls:"+this.balls+" ,Cricket strikeRate:"+this.strikeRate;
    }
    @Override
    public int hashCode(){
        return 38;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Cricket){
            Cricket cricket1=this;
            Cricket cricket2=(Cricket) obj;
            if(cricket1.runs==cricket1.runs && cricket2.balls==cricket2.balls){
                return true;
            }
        }
        return false;
    }
}
