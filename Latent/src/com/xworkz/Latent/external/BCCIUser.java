package com.xworkz.Latent.external;

import com.xworkz.Latent.internal.Icc;

public class BCCIUser {
    private Icc icc;

    public BCCIUser(Icc icc){
        this.icc=icc;
    }
    public void Ipl(){
        if(icc!=null){
            this.icc.fairPlay();
        }
        else{
            System.out.println("Null");
        }
    }
}
