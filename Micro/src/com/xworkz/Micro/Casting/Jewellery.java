package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Diamond;
import com.xworkz.Micro.External.Ring;

public class Jewellery {
    public void price(Ring ring){
        ring.design();
        ring.buy();
        ring.color();
        ring.wash();
        ring.wear();

        if(ring instanceof Diamond){
            Diamond diamond=new Diamond();
            diamond.purchase();
        }
    }
}
