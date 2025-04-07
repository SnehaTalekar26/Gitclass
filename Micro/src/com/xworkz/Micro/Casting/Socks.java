package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Puma;
import com.xworkz.Micro.External.Shoes;

public class Socks {
    public void smell(Shoes shoes){
        shoes.Carry();
        shoes.sell();
        shoes.wash();
        shoes.wear();
        shoes.buy();

        if(shoes instanceof Puma){
            Puma puma=new Puma();
            puma.cover();
        }
    }
}
