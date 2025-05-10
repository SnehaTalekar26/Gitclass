package com.xworkz.accessspecifier;

public class Game {
    public String gameName="Among Us";
    int totalscore=100;
    private int noOfPlayers=12;

    public void play(){
        System.out.println("Name of the game:"+gameName);
    }
    void move(){
        System.out.println("Total score of the player:"+totalscore);
    }
    private void kill(){
        System.out.println(noOfPlayers);
    }
    void checkGame(){
        System.out.println("Number of players in game:"+noOfPlayers);
    }
}
