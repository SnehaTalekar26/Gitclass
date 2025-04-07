package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Bag;
import com.xworkz.Micro.External.Nike;

public class Adidas {
    public void wear(Bag bag){
        bag.buy();
        bag.wear();
        bag.wash();
        bag.carry();
        bag.color();

        if(bag instanceof Nike){
            Nike nike=new Nike();
            nike.brand();
        }
    }
}
