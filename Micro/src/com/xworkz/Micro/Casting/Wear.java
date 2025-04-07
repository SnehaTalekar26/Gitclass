package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Casual;
import com.xworkz.Micro.External.Tshirt;

public class Wear {
    public void out(Tshirt tshirt){
        tshirt.color();
        tshirt.use();
        tshirt.type();
        tshirt.show();
        tshirt.design();

        if(tshirt instanceof Casual){
            Casual casual=new Casual();
            casual.quality();
        }
    }
}
