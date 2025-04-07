package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Panipuri;
import com.xworkz.Micro.External.Chaat;

public class Sukapuri {
    public void drink(Panipuri panipuri){
        panipuri.eat();
        panipuri.color();
        panipuri.type();
        panipuri.flavor();
        panipuri.taste();

        if(panipuri instanceof Chaat){
            Chaat chaat=new Chaat();
            chaat.waste();
        }
    }
}
