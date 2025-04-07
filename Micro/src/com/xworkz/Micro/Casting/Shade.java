package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Dior;
import com.xworkz.Micro.External.Lipstick;

public class Shade {
    public void match(Lipstick lipstick){
        lipstick.quality();
        lipstick.brand();
        lipstick.color();
        lipstick.duration();
        lipstick.type();

        if(lipstick instanceof Dior){
            Dior dior=new Dior();
            dior.company();
        }
    }
}
