package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Bakery;
import com.xworkz.Micro.External.Jalebi;

public class Sweets {
    public void eat(Bakery bakery){
        bakery.visit();
        bakery.sweets();
        bakery.place();
        bakery.location();
        bakery.type();

        if(bakery instanceof Jalebi){
            Jalebi jalebi=new Jalebi();
            jalebi.buy();
        }
    }
}
