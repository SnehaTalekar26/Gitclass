package com.xworkz.references;

public class House {
    String houseName;
    Room[] room;
    Portfolio[] portfolio;
    HouseKeep[] houseKeep;

    House(String houseName,Room[] room,Portfolio[] portfolio,HouseKeep[] houseKeep){
        this.houseName=houseName;
        this.room=room;
        this.portfolio=portfolio;
        this.houseKeep=houseKeep;
    }

    void houseDisplay(){
        System.out.println("House Name:"+this.houseName);
        for(Room ref:room){
            if(ref!=null){
                ref.roomDisplay();
            }
            else
                System.err.println("Pointing to null");
        }
        for(Portfolio ref:portfolio){
            if(ref!=null){
                ref.portfolioDisplay();
            }
            else
                System.err.println("Pointing to null");
        }
        for(HouseKeep ref:houseKeep){
            if(ref!=null){
                ref.housekeeperDisplay();
            }
            else
                System.err.println("Pointing to null");
        }
    }
}
