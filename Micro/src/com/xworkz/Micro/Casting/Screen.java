package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Projector;
import com.xworkz.Micro.External.DLP;

public class Screen {
    public void cast(Projector projector){
        projector.clean();
        projector.color();
        projector.use();
        projector.type();
        projector.design();

        if(projector instanceof DLP){
            DLP dlp=new DLP();
            dlp.charge();
        }
    }
}
