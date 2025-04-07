package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Chocolate;
import com.xworkz.Micro.External.DairyMilk;

public class Manufacture {
    public void item(Chocolate chocolate){
        chocolate.flavor();
        chocolate.share();
        chocolate.wrapper();
        chocolate.eat();
        chocolate.purchase();

        if(chocolate instanceof DairyMilk){
            DairyMilk dairyMilk=new DairyMilk();
            dairyMilk.taste();
        }
    }
}
