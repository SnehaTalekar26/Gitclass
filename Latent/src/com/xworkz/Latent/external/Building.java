package com.xworkz.Latent.external;

import com.xworkz.Latent.internal.Charger;
import com.xworkz.Latent.internal.House;
import com.xworkz.Latent.internal.HouseImpl;

public class Building {
    private House house;

    public Building(House house){
        this.house=house;
    }
    public void rooms(){
        if(house !=null){
            this.house.wall();
        }
        else{
            System.out.println("Null");
        }
    }
}
