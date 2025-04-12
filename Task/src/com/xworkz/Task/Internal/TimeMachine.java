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
}
