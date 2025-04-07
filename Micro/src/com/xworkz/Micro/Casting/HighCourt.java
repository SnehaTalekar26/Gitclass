package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Court;
import com.xworkz.Micro.External.Lawyer;

public class HighCourt {
    public void judgement(Court court){
        court.law();
        court.rules();
        court.type();
        court.judge();
        court.rating();

        if(court instanceof Lawyer){
            Lawyer lawyer=new Lawyer();
            lawyer.fight();
        }
    }
}
