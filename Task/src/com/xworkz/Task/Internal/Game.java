package com.xworkz.Task.Internal;

public class Game {
    private String name;
    private String genre;
    private int players;

    public Game(String name, String genre, int players){
        this.name = name;
        this.genre = genre;
        this.players = players;
    }

    @Override
    public String toString(){
        return " Game name: " + this.name + " ,Genre: " + this.genre + " ,Players: " + this.players;
    }
    @Override
    public int hashCode(){
        return 111;
    }
}
