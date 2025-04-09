package com.xworkz.Task.Internal;

public class College {
    private String principalName;
    private int noOfStudents;
    private boolean isAutonomous;

    public College(String principalName, int noOfStudents, boolean isAutonomous){
        this.principalName = principalName;
        this.noOfStudents = noOfStudents;
        this.isAutonomous = isAutonomous;
    }

    @Override
    public String toString(){
        return " College principalName: " + this.principalName + " ,NoOfStudents: " + this.noOfStudents + "IsAutonomous: " + this.isAutonomous;
    }
}
