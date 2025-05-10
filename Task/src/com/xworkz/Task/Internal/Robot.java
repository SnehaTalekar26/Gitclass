package com.xworkz.Task.Internal;

public class Robot {
    private String name;
    private int batteryLife;
    private boolean hasAI;

    public Robot(String name, int batteryLife, boolean hasAI){
        this.name = name;
        this.batteryLife = batteryLife;
        this.hasAI = hasAI;
    }

    @Override
    public String toString(){
        return " Robot name: " + this.name + " ,Battery Life: " + this.batteryLife + " hours ,AI Enabled: " + this.hasAI;
    }
    @Override
    public int hashCode(){
        return 87;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Robot){
            Robot robot1=this;
            Robot robot2=(Robot) obj;
            if(robot1.name==robot1.name && robot2.batteryLife==robot2.batteryLife){
                return true;
            }
        }
        return false;
    }
}
