package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Country;
import com.xworkz.Micro.External.India;

public class Travel {
    public void Roam(Country country){
        country.travel();
        country.flag();
        country.population();
        country.type();
        country.trees();

        if(country instanceof India){
            India india=new India();
            india.people();
        }
    }
}
