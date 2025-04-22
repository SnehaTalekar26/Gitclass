package com.xworkz.Latent.external;

import com.xworkz.Latent.internal.Food;
import com.xworkz.Latent.internal.House;

public class Restaurant {
    private Food food;

    public Restaurant(Food food){
        this.food=food;
    }
    public void prepare(){
        if(food !=null){
            this.food.serve();
        }
        else{
            System.out.println("Null");
        }
    }
}
