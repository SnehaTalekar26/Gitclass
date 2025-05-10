package com.xworkz.Sneha.ViratRoutine;

import com.sun.javaws.BrowserSupport;
import com.xworkz.Sneha.Clip.Clip;
import com.xworkz.Sneha.Cricket.Cricket;
import com.xworkz.Sneha.Cricket.Ticket;

public class Virat {
    Clip clip;
    Cricket cricket;
    Ticket ticket;
    Brush brush;

    Virat(Clip clip, Cricket cricket, Ticket ticket, Brush brush){
        this.clip=clip;
        this.cricket=cricket;
        this.ticket=ticket;
        this.brush=brush;
    }
    void play(){
        if(this.cricket!=null){
            System.out.println("----------------");
            System.out.println("Running cricket methods in play");
            this.cricket.cricketSeatType();
            this.cricket.watch();
        }
        else
            System.out.println("Pointing to null");
    }
    void clean(){
        if(this.brush!=null){
            System.out.println("----------------");
            System.out.println("Running brush methods in clean");
            brush.color();
            brush.clean();
            brush.scrub();
        }
        else
            System.out.println("Pointing to null");
    }
    void relax(){
        if(this.ticket!=null){
            System.out.println("----------------");
            System.out.println("Running ticket methods in relax");
            this.ticket.type();
            this.ticket.cost();
            this.ticket.buy();
            this.ticket.sell();
        }
        else
            System.out.println("Pointing to null");
    }
}
