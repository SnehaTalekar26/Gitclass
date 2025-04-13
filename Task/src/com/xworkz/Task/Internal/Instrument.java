package com.xworkz.Task.Internal;

public class Instrument {
    private String name;
    private String type;
    private boolean isElectric;

    public Instrument(String name, String type, boolean isElectric){
        this.name = name;
        this.type = type;
        this.isElectric = isElectric;
    }

    @Override
    public String toString(){
        return " Instrument name: " + this.name + " ,Type: " + this.type + " ,Electric: " + this.isElectric;
    }
    @Override
    public int hashCode(){
        return 786;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Instrument){
            Instrument instrument1=this;
            Instrument instrument2=(Instrument) obj;
            if(instrument1.name==instrument1.name && instrument2.type==instrument2.type){
                return true;
            }
        }
        return false;
    }
}
