package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Crime;
import com.xworkz.Micro.External.Police;

public class Legal {
    public void jail(Police police){
        police.respect();
        police.law();
        police.strong();
        police.type();
        police.rules();

        if(police instanceof Crime){
            Crime crime=new Crime();
            crime.illegal();
        }
    }
}
