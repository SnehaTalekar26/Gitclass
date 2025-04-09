package com.xworkz.Task.Internal;

public class Hospital {
    private String doctorName;
    private int noOfPatients;
    private boolean isEmergencyAvailable;

    public Hospital(String doctorName, int noOfPatients, boolean isEmergencyAvailable){
        this.doctorName = doctorName;
        this.noOfPatients = noOfPatients;
        this.isEmergencyAvailable = isEmergencyAvailable;
    }

    @Override
    public String toString(){
        return " Hospital doctorName: " + this.doctorName + " ,NoOfPatients: " + this.noOfPatients + "IsEmergencyAvailable: " + this.isEmergencyAvailable;
    }
}
