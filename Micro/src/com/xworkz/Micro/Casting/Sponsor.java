package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.CocaCola;
import com.xworkz.Micro.External.Colddrink;

public class Sponsor {
    public void sell(Colddrink colddrink){
        colddrink.drink();
        colddrink.type();
        colddrink.color();
        colddrink.show();
        colddrink.design();

        if(colddrink instanceof CocaCola){
            CocaCola cocaCola=new CocaCola();
            cocaCola.sale();
        }
    }
}
