package com.xworkz.Latent.external;

import com.xworkz.Latent.internal.Chocolate;
import com.xworkz.Latent.internal.Laptop;

public class DairyMilk {
    private Chocolate chocolate;

    public DairyMilk(Chocolate chocolate){
        this.chocolate=chocolate;
    }
    public void melt(){
        if(chocolate!=null){
            this.chocolate.eat();
        }
        else{
            System.out.println("Null");
        }
    }
}
