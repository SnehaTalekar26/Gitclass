package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Gate;
import com.xworkz.Micro.External.Steel;

public class Build {
    public void add(Gate gate){
        gate.put();
        gate.type();
        gate.color();
        gate.wash();
        gate.design();

        if(gate instanceof Steel){
            Steel steel=new Steel();
            steel.quality();
        }
    }
}
