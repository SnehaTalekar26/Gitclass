package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.*;

public class Dive {
    public void scuba(Sea sea){
        sea.weather();
        sea.swim();
        sea.tree();
        sea.run();
        sea.type();

        if(sea instanceof Arabian){
            Arabian arabian=new Arabian();
            arabian.drown();
        }
    }
}
