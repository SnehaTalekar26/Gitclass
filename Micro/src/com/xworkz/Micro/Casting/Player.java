package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Athlete;
import com.xworkz.Micro.External.Sports;

public class Player {
    public void play(Athlete athlete){
        athlete.workout();
        athlete.fit();
        athlete.run();
        athlete.type();
        athlete.rules();

        if(athlete instanceof Sports){
            Sports sports=new Sports();
            sports.diet();
        }
    }
}
