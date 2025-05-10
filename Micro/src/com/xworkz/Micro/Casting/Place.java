package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Gym;
import com.xworkz.Micro.External.Wig;
import com.xworkz.Micro.External.WorkOut;

public class Place {
    public void exercise(Gym gym){
        gym.dumbbells();
        gym.place();
        gym.location();
        gym.type();
        gym.visit();

        if(gym instanceof WorkOut){
            WorkOut workOut=new WorkOut();
            workOut.train();
        }
    }
}
