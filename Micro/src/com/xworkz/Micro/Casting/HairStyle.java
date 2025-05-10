package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Hair;
import com.xworkz.Micro.External.Wig;

public class HairStyle {
    public void style(Hair hair){
        hair.style();
        hair.straight();
        hair.curl();
        hair.type();
        hair.color();

        if(hair instanceof Wig){
            Wig wig=new Wig();
            wig.burn();
        }
    }
}
