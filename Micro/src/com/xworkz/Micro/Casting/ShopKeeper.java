package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Ration;
import com.xworkz.Micro.External.Shop;

public class ShopKeeper {
    public void sell(Shop shop){
        shop.visit();
        shop.type();
        shop.things();
        shop.place();
        shop.location();

        if(shop instanceof Ration){
            Ration ration=new Ration();
            ration.buy();
        }
    }
}
