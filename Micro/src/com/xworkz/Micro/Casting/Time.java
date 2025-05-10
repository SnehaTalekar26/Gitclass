package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Casio;
import com.xworkz.Micro.External.Clock;

public class Time {
    public void look(Clock clock){
        clock.color();
        clock.lens();
        clock.duration();
        clock.type();
        clock.quality();

        if(clock instanceof Casio){
            Casio casio=new Casio();
            casio.price();
        }
    }
}
