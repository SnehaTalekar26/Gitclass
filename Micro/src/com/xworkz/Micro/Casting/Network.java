package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Sim;
import com.xworkz.Micro.External.Jio;

public class Network {
    public void explore(Sim sim){
        sim.connect();
        sim.buy();
        sim.call();
        sim.use();
        sim.sell();

        if(sim instanceof Jio){
            Jio jio=new Jio();
            jio.cut();
        }
    }
}
