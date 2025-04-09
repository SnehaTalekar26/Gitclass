package com.xworkz.Task.Internal;

public class Gym {
    private String trainerName;
    private int noOfMembers;
    private boolean isOpen24Hours;

    public Gym(String trainerName, int noOfMembers, boolean isOpen24Hours){
        this.trainerName = trainerName;
        this.noOfMembers = noOfMembers;
        this.isOpen24Hours = isOpen24Hours;
    }

    @Override
    public String toString(){
        return " Gym trainerName: " + this.trainerName + " ,NoOfMembers: " + this.noOfMembers + "IsOpen24Hours: " + this.isOpen24Hours;
    }
}
