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
}
