package com.xworkz.Task.Internal;

public class Programming {
    private int counter;
    private int limit;
    private int size;

    public Programming(int counter,int limit,int size){
        this.counter=counter;
        this.limit=limit;
        this.size=size;
    }

    @Override
    public String toString(){
        return " Programming counter:"+this.counter+" ,Programming limit:"+this.limit+" ,Programming size:"+this.size;
    }
}
