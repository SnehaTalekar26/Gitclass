package com.xworkz.Task.Internal;

public class Remote {
    private String model;
    private boolean supportsVoiceControl;
    private int numberOfButtons;

    public Remote(String model, boolean supportsVoiceControl, int numberOfButtons){
        this.model = model;
        this.supportsVoiceControl = supportsVoiceControl;
        this.numberOfButtons = numberOfButtons;
    }

    @Override
    public String toString(){
        return " TVRemote model: " + this.model + " ,Voice Control: " + this.supportsVoiceControl + " ,Buttons: " + this.numberOfButtons;
    }
}
