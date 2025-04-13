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
    @Override
    public int hashCode(){
        return 43;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Hospital){
            Hospital hospital1=this;
            Hospital hospital2=(Hospital) obj;
            if(hospital1.doctorName==hospital1.doctorName && hospital2.noOfPatients==hospital2.noOfPatients){
                return true;
            }
        }
        return false;
    }
}
