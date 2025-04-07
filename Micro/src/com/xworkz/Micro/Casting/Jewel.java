package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Gold;
import com.xworkz.Micro.External.Necklace;

public class Jewel {
    public void purchase(Necklace necklace){
        necklace.buy();
        necklace.color();
        necklace.design();
        necklace.wash();
        necklace.wear();

        if(necklace instanceof Gold){
            Gold gold=new Gold();
            gold.brand();
        }
    }
}
