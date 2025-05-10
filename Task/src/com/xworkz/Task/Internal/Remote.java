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
    @Override
    public int hashCode(){
        return 916;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Remote){
            Remote remote1=this;
            Remote remote2=(Remote) obj;
            if(remote1.model==remote1.model && remote2.supportsVoiceControl==remote2.supportsVoiceControl){
                return true;
            }
        }
        return false;
    }
}
