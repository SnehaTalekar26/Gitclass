package com.xworkz.Micro.Casting;

import com.xworkz.Micro.External.Board;
import com.xworkz.Micro.External.Duster;

public class BlackBoard {
    public void write(Board board){
        board.chalk();
        board.write();
        board.read();
        board.color();
        board.clean();

        if(board instanceof Duster){
            Duster duster=new Duster();
            duster.write();
        }
    }
}
