package com.xworkz.Task.Internal;

public class Cooker {
    private String type;
    private int capacity;
    private boolean isElectric;

    public Cooker(String type, int capacity, boolean isElectric){
        this.type = type;
        this.capacity = capacity;
        this.isElectric = isElectric;
    }

    @Override
    public String toString(){
        return " Cooker type: " + this.type + " ,Capacity: " + this.capacity + " L ,Electric: " + this.isElectric;
    }
    @Override
    public int hashCode(){
        return 30;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Cooker){
            Cooker cooker1=this;
            Cooker cooker2=(Cooker) obj;
            if(cooker1.type==cooker1.type && cooker2.capacity==cooker2.capacity){
                return true;
            }
        }
        return false;
    }
}
