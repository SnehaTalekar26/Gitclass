package com.xworkz.references;

public class HouseKeep {
    String houseKeeperName;
    Transport transport;

    public HouseKeep(String houseKeeperName,Transport transport){
        this.houseKeeperName=houseKeeperName;
        this.transport=transport;
    }

    public void housekeeperDisplay(){
        System.out.println("House Keeper Name:"+this.houseKeeperName);
        if(this.transport!=null){
            this.transport.transportDisplay();
        }
    }
}
