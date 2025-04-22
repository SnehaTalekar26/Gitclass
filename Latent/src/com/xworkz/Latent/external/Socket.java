package com.xworkz.Latent.external;

import com.xworkz.Latent.internal.Charger;
import com.xworkz.Latent.internal.ChargerImpl;
import com.xworkz.Latent.internal.Chocolate;

public class Socket {
    private Charger charger;

    public Socket(Charger charger){
        this.charger=charger;
    }
    public void Switch(){
        if(charger !=null){
            this.charger.charge();
        }
        else{
            System.out.println("Null");
        }
    }
}
