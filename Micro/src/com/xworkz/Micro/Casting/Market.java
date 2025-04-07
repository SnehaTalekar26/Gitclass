package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Fish;
import com.xworkz.Micro.External.Salmon;

public class Market {
    public void sell(Fish fish){
        fish.dish();
        fish.type();
        fish.cut();
        fish.eat();
        fish.purchase();

        if(fish instanceof Salmon){
            Salmon salmon=new Salmon();
            salmon.water();
        }
    }
}
