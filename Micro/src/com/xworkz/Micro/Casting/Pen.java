package com.xworkz.Micro.Casting;

import com.sun.java.browser.plugin2.DOM;
import com.xworkz.Micro.External.Doms;
import com.xworkz.Micro.External.Pencil;

public class Pen {
    public void length(Pencil pencil){
        pencil.color();
        pencil.sharp();
        pencil.type();
        pencil.use();
        pencil.design();

        if(pencil instanceof Doms){
            Doms doms=new Doms();
            doms.brand();
        }
    }
}
