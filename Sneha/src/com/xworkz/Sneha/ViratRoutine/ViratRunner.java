package com.xworkz.Sneha.ViratRoutine;

import com.xworkz.Sneha.Clip.Clip;
import com.xworkz.Sneha.Cricket.Cricket;
import com.xworkz.Sneha.Cricket.Ticket;

public class ViratRunner {
    public static void main(String[] args){
        Clip clip=new Clip();
        Ticket ticket=new Ticket();
        Cricket cricket=new Cricket(ticket);
        Brush brush=new Brush();

        Virat virat=new Virat(clip,cricket,ticket,brush);

        virat.play();
        virat.clean();
        virat.relax();
    }
}
