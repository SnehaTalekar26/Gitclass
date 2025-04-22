package com.xworkz.Latent.external;

import com.xworkz.Latent.internal.Bag;
import com.xworkz.Latent.internal.Book;

public class Compartments {
    private Bag bag;

    public Compartments(Bag bag){
        this.bag=bag;
    }
    public void cover(){
        if(bag !=null){
            this.bag.zip();
        }
        else{
            System.out.println("Null");
        }
    }
}
