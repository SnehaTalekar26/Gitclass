package com.xworkz.Micro.Runner;

import com.xworkz.Micro.Internal.*;
import java.lang.reflect.Type;

public class RubberRunner {
    public static void main(String[] args) {
        System.out.println("Running Rubber");
        Rubber rubber=new Rubber();
        rubber.expand();
        Rubber rubber1=new Tyre();
        rubber1.expand();
        Tyre tyre=new Tyre();
        tyre.expand();
        tyre.compress();

        MRFTyre mrfTyre=new MRFTyre();
        mrfTyre.expand();
        mrfTyre.compress();
        mrfTyre.radial();

        ArmyVehicle armyVehicle=new ArmyVehicle();
        armyVehicle.wheel(rubber1);
        armyVehicle.wheel(tyre);
        armyVehicle.wheel(rubber);
        armyVehicle.wheel(mrfTyre);
    }
}
