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
}
