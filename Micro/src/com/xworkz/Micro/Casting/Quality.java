package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Headphone;
import com.xworkz.Micro.External.Bose;

public class Quality {
    public void goodQuality(Headphone headphone){
        headphone.use();
        headphone.color();
        headphone.design();
        headphone.show();
        headphone.type();

        if(headphone instanceof Bose){
            Bose bose=new Bose();
            bose.wear();
        }
    }
}