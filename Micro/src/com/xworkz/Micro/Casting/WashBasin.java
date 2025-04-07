package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Brush;
import com.xworkz.Micro.External.Colgate;

public class WashBasin {
    public void Basin(Brush brush){
        brush.use();
        brush.wash();
        brush.purchase();
        brush.shoes();
        brush.clean();

        if(brush instanceof Colgate){
            Colgate colgate=new Colgate();
            colgate.rub();
        }
    }
}
