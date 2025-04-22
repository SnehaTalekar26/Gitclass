package com.xworkz.Latent.external;

import com.xworkz.Latent.internal.Constitution;
import com.xworkz.Latent.internal.Icc;

public class Government {
    private Constitution constitution;

    public Government(Constitution constitution){
        this.constitution=constitution;
    }
    public void law(){
        if(constitution!=null){
            this.constitution.followLaws();
        }
        else{
            System.out.println("Null");
        }
    }
}
