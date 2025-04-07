package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Bracelet;
import com.xworkz.Micro.External.Cartier;

public class Gift {
    public void give(Bracelet bracelet){
        bracelet.design();
        bracelet.show();
        bracelet.color();
        bracelet.wear();
        bracelet.type();

        if(bracelet instanceof Cartier){
            Cartier cartier=new Cartier();
            cartier.quality();
        }
    }
}
