package com.xworkz.accessspecifier;

public class GameRunner {
    public static void main(String[] args){
        System.out.println("Running Game Runner");
        Game game=new Game();
        game.play();
        game.move();
        game.checkGame();
    }
}
