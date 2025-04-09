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
}
