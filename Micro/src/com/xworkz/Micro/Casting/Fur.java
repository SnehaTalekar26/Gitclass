package com.xworkz.Micro.Casting;

import com.xworkz.Micro.Internal.*;

public class Fur {
    public void FurRunner(Animals animals){
        animals.vet();
        animals.sleep();
        animals.growth();
        animals.livingBeings();
        animals.eat();

        if(animals instanceof Cat){
            System.out.println("Running Fur");
            Cat cat=new Cat();
            cat.drink();
        }
    }
}
