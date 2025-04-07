package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Plant;
import com.xworkz.Micro.External.Rose;

public class Grow {
    public void water(Plant plant){
        plant.grow();
        plant.dead();
        plant.seed();
        plant.leaves();
        plant.tree();

        if(plant instanceof Rose){
            Rose rose=new Rose();
            rose.steam();
        }
    }
}
