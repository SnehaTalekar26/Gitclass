package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.KitKat;
import com.xworkz.Micro.External.MilkShake;

public class Cold {
    public void straw(MilkShake milkShake){
        milkShake.drink();
        milkShake.color();
        milkShake.type();
        milkShake.flavor();
        milkShake.taste();

        if(milkShake instanceof KitKat){
            KitKat kitKat=new KitKat();
            kitKat.crunch();
        }
    }
}
