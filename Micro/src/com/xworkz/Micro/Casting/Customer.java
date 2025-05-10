package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Furniture;
import com.xworkz.Micro.External.Wooden;

public class Customer {
    public void sell(Furniture furniture){
        furniture.sell();
        furniture.buy();
        furniture.scratch();
        furniture.build();
        furniture.sketch();

        if(furniture instanceof Wooden){
            Wooden wooden=new Wooden();
            wooden.share();
        }
    }
}
