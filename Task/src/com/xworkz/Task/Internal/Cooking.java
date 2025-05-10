package com.xworkz.Task.Internal;

public class Cooking {
    private int flour;
    private int water;
    private int sugar;

    public Cooking(int flour,int water,int sugar){
        this.flour=flour;
        this.water=water;
        this.sugar=sugar;
    }

    @Override
    public String toString(){
        return " Cooking flour:"+this.flour+" ,Cooking water:"+this.water+" ,Cooking sugar:"+this.sugar;
    }
    @Override
    public int hashCode(){
        return 33;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Cooking){
            Cooking cooking1=this;
            Cooking cooking2=(Cooking) obj;
            if(cooking1.flour==cooking1.flour && cooking2.water==cooking2.water){
                return true;
            }
        }
        return false;
    }
}
