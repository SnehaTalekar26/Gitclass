package com.xworkz.Task.Internal;

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
}
