package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Iskcon;
import com.xworkz.Micro.External.Temple;

public class Prayer {
    public void bell(Temple temple){
        temple.type();
        temple.people();
        temple.statue();
        temple.rating();
        temple.construction();

        if(temple instanceof Iskcon){
            Iskcon iskcon=new Iskcon();
            iskcon.pray();
        }
    }
}
