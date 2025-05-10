package com.xworkz.Task.Internal;

public class Train {
    private String name;
    private int coaches;
    private boolean isHighSpeed;

    public Train(String name, int coaches, boolean isHighSpeed){
        this.name = name;
        this.coaches = coaches;
        this.isHighSpeed = isHighSpeed;
    }

    @Override
    public String toString(){
        return " Train name: " + this.name + " ,Coaches: " + this.coaches + " ,High Speed: " + this.isHighSpeed;
    }
    @Override
    public int hashCode(){
        return 39;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Train){
            Train train1=this;
            Train train2=(Train) obj;
            if(train1.name==train1.name && train2.coaches==train2.coaches){
                return true;
            }
        }
        return false;
    }
}
