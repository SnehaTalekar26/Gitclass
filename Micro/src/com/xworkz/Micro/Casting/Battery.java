package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Anker;
import com.xworkz.Micro.External.PowerBank;

public class Battery {
    public void charge(PowerBank powerBank){
        powerBank.charge();
        powerBank.wire();
        powerBank.connect();
        powerBank.recharge();
        powerBank.type();

        if(powerBank instanceof Anker){
            Anker anker=new Anker();
            anker.brand();
        }
    }
}
