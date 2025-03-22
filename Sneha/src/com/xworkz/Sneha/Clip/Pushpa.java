package com.xworkz.Sneha.Clip;

public class Pushpa {
    Clip[] clip;
    void useClip(){
        for(Clip ref:clip){
            if(ref!=null){
                ref.hold();
                ref.displayColor();
            }
            else System.err.println("Pointing to null");
        }
    }

}
