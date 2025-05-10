package com.xworkz.references;

public class Transport {
    String transportMode;

    public Transport(String transportMode){
        this.transportMode=transportMode;
    }
    void transportDisplay(){
        System.out.println("Transport Mode:"+this.transportMode);
        System.out.println("----------------------------------");
    }
}
