package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Notepad;
import com.xworkz.Micro.External.WritingPad;

public class ClipBoard {
    public void clip(WritingPad writingPad){
        writingPad.clean();
        writingPad.color();
        writingPad.use();
        writingPad.type();
        writingPad.design();

        if(writingPad instanceof Notepad){
            Notepad notepad=new Notepad();
            notepad.write();
        }
    }
}
