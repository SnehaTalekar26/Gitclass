package com.xworkz.Task.Internal;

public class Dice {
    private int noOfDice;
    private int outcomes;
    private int probability;

    public Dice(int noOfDice,int outcomes,int probability){
        this.noOfDice=noOfDice;
        this.outcomes=outcomes;
        this.probability=probability;
    }

    @Override
    public String toString(){
        return " Dice noOfDice:"+this.noOfDice+" ,Dice outcomes:"+this.outcomes+" ,Dice probability:"+this.probability;
    }
    @Override
    public int hashCode(){
        return 77;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Dice){
            Dice dice1=this;
            Dice dice2=(Dice) obj;
            if(dice1.noOfDice==dice1.noOfDice && dice2.outcomes==dice2.outcomes){
                return true;
            }
        }
        return false;
    }
}
