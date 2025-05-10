package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.LensKart;
import com.xworkz.Micro.External.Specks;

public class Showroom {
    public void show(Specks specks){
        specks.lens();
        specks.color();
        specks.duration();
        specks.quality();
        specks.type();

        if(specks instanceof LensKart){
            LensKart lensKart=new LensKart();
            lensKart.glass();
        }
    }
}
