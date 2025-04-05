package com.xworkz.Micro.Internal;

public class AmongUs extends Games{
    @Override
    public void play(){
        System.out.println("Playing the game");
    }
    @Override
    public void expert(){
        System.out.println("Expert in game");
    }
    @Override
    public void admin(){
        System.out.println("Admin of team in game");
    }
    @Override
    public void noob(){
        System.out.println("Noob player in game");
    }
    @Override
    public void join(){
        System.out.println("Joining team in game");
    }
}
