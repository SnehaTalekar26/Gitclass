package com.xworkz.Micro.Casting;

import com.xworkz.Micro.Internal.Art;
import com.xworkz.Micro.Internal.Artist;

public class Creative {
    public void vibe(Art art){
        art.draw();
        art.sell();
        art.frame();
        art.create();
        art.buy();

        if(art instanceof Artist){
            Artist artist=new Artist();
            artist.redraw();
        }
    }
}
