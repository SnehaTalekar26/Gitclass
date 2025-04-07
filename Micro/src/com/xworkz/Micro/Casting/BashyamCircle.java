package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.City;
import com.xworkz.Micro.External.Bangalore;

public class BashyamCircle {
    public void Xworkz(City city){
        city.shop();
        city.population();
        city.type();
        city.trees();
        city.travel();

        if(city instanceof Bangalore){
            Bangalore bangalore=new Bangalore();
            bangalore.roam();
        }
    }
}
