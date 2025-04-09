package com.xworkz.Task.Internal;

public class Museum {
    private String curatorName;
    private int noOfArtifacts;
    private boolean isGuidedTourAvailable;

    public Museum(String curatorName, int noOfArtifacts, boolean isGuidedTourAvailable){
        this.curatorName = curatorName;
        this.noOfArtifacts = noOfArtifacts;
        this.isGuidedTourAvailable = isGuidedTourAvailable;
    }

    @Override
    public String toString(){
        return " Museum curatorName: " + this.curatorName + " ,NoOfArtifacts: " + this.noOfArtifacts + "IsGuidedTourAvailable: " + this.isGuidedTourAvailable;
    }
}
