package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Charger;
import com.xworkz.Micro.External.Cpin;

public class Wire {
    public void adopter(Charger charger){
        charger.current();
        charger.wire();
        charger.phone();
        charger.socket();
        charger.connection();

        if(charger instanceof Cpin){
            Cpin cpin=new Cpin();
            cpin.charge();
        }
    }
}
