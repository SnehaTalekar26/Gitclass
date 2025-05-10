package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Rain;
import com.xworkz.Micro.External.Umbrella;

public class Dark {
    public void getWet(Rain rain){
        rain.cloud();
        rain.mud();
        rain.raincoat();
        rain.weather();
        rain.water();

        if(rain instanceof Umbrella){
            Umbrella umbrella=new Umbrella();
            umbrella.run();
        }
    }
}
