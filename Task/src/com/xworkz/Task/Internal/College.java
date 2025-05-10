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
    @Override
    public int hashCode(){
        return 7;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof College){
            College college1=this;
            College college2=(College) obj;
            if(college1.principalName==college1.principalName && college2.noOfStudents==college2.noOfStudents){
                return true;
            }
        }
        return false;
    }
}
