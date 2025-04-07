package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Rolex;
import com.xworkz.Micro.External.Watch;

public class Luxury {
    public void buy(Watch watch){
        watch.wear();
        watch.type();
        watch.show();
        watch.battery();
        watch.color();

        if(watch instanceof Rolex){
            Rolex rolex=new Rolex();
            rolex.brand();
        }
    }
}
