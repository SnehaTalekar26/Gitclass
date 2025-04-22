package com.xworkz.Latent.external;

import com.xworkz.Latent.internal.Constitution;
import com.xworkz.Latent.internal.Laptop;

public class OperatingSystem {
    private Laptop laptop;

    public OperatingSystem(Laptop laptop){
        this.laptop=laptop;
    }
    public void chip(){
        if(laptop!=null){
            this.laptop.process();
        }
        else{
            System.out.println("Null");
        }
    }
}
