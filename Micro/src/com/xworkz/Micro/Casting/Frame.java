package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Photographer;
import com.xworkz.Micro.External.Photos;

public class Frame {
    public void snap(Photographer photographer){
        photographer.followers();
        photographer.click();
        photographer.passion();
        photographer.type();
        photographer.rating();

        if(photographer instanceof Photos){
            Photos photos=new Photos();
            photos.feedback();
        }
    }
}
