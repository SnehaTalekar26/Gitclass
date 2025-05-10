package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Jacket;
import com.xworkz.Micro.External.Zip;

public class Leather {
    public void put(Jacket jacket){
        jacket.wear();
        jacket.wash();
        jacket.borrow();
        jacket.open();
        jacket.close();

        if(jacket instanceof Zip){
            Zip zip=new Zip();
            zip.stitch();
        }
    }
}
