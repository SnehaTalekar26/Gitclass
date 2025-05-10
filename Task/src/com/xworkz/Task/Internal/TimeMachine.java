package com.xworkz.Task.Internal;

public class TimeMachine {
    private String destinationYear;
    private String operatorName;
    private int fuelLevel;

    public TimeMachine(String destinationYear, String operatorName, int fuelLevel){
        this.destinationYear = destinationYear;
        this.operatorName = operatorName;
        this.fuelLevel = fuelLevel;
    }

    @Override
    public String toString(){
        return " TimeMachine destination: " + this.destinationYear + " ,Operator: " + this.operatorName + " ,Fuel Level: " + this.fuelLevel + "%";
    }
    @Override
    public int hashCode(){
        return 112;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof TimeMachine){
            TimeMachine timeMachine1=this;
            TimeMachine timeMachine2=(TimeMachine) obj;
            if(timeMachine1.destinationYear==timeMachine1.destinationYear && timeMachine2.operatorName==timeMachine2.operatorName){
                return true;
            }
        }
        return false;
    }
}
