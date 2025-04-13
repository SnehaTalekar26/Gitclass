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
    @Override
    public int hashCode(){
        return 873;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Programming){
            Programming programming1=this;
            Programming programming2=(Programming) obj;
            if(programming1.counter==programming1.counter && programming2.limit==programming2.limit){
                return true;
            }
        }
        return false;
    }
}
