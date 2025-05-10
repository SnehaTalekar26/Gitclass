package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.History;
import com.xworkz.Micro.External.Story;

public class Fighters {
    public void fights(History history){
        history.type();
        history.book();
        history.people();
        history.rating();
        history.statue();

        if(history instanceof Story){
            Story story=new Story();
            story.read();
        }
    }
}
