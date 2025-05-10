package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Beach;
import com.xworkz.Micro.External.Island;

public class Sand {
    public void mud(Beach beach){
        beach.run();
        beach.swim();
        beach.tree();
        beach.type();
        beach.weather();

        if(beach instanceof Island){
            Island island=new Island();
            island.land();
        }
    }
}
