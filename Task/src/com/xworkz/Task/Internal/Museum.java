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
    @Override
    public int hashCode(){
        return 86;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Museum){
            Museum museum1=this;
            Museum museum2=(Museum) obj;
            if(museum1.curatorName==museum1.curatorName && museum2.noOfArtifacts==museum2.noOfArtifacts){
                return true;
            }
        }
        return false;
    }
}
