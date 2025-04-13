package com.xworkz.Task.Internal;

public class Chess {
    private String playerOne;
    private String playerTwo;
    private int duration;

    public Chess(String playerOne, String playerTwo, int duration){
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.duration = duration;
    }

    @Override
    public String toString(){
        return " Chess Player 1: " + this.playerOne + " ,Chess Player 2: " + this.playerTwo + " ,Chess Duration: " + this.duration + " mins";
    }
    @Override
    public int hashCode(){
        return 91;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Chess){
            Chess chess1=this;
            Chess chess2=(Chess) obj;
            if(chess1.playerOne==chess1.playerOne && chess2.playerTwo==chess2.playerTwo){
                return true;
            }
        }
        return false;
    }
}
