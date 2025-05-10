package com.xworkz.Task.Internal;

import java.security.Key;

public class Keyboard {
    private String type;
    private boolean isMechanical;
    private String layout;

    public Keyboard(String type, boolean isMechanical, String layout){
        this.type = type;
        this.isMechanical = isMechanical;
        this.layout = layout;
    }

    @Override
    public String toString(){
        return " Keyboard type: " + this.type + " ,Mechanical: " + this.isMechanical + " ,Layout: " + this.layout;
    }
    @Override
    public int hashCode(){
        return 4676;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Keyboard){
            Keyboard keyboard1=this;
            Keyboard keyboard2=(Keyboard) obj;
            if(keyboard2.type==keyboard1.type && keyboard2.isMechanical==keyboard2.isMechanical){
                return true;
            }
        }
        return false;
    }
}
