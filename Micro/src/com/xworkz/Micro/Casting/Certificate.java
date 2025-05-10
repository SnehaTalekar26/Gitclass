package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Center;
import com.xworkz.Micro.External.Training;

public class Certificate {
    public void report(Center center){
        center.type();
        center.books();
        center.location();
        center.place();
        center.visit();

        if(center instanceof Training){
            Training training=new Training();
            training.water();
        }
    }
}
