package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Juice;
import com.xworkz.Micro.External.Mango;

public class Straw {
    public void quality(Juice juice){
        juice.pour();
        juice.buy();
        juice.packet();
        juice.glass();
        juice.drink();

        if(juice instanceof Mango){
            Mango mango=new Mango();
            mango.thick();
        }
    }
}
