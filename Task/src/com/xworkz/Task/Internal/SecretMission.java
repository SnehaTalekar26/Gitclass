package com.xworkz.Task.Internal;

public class SecretMission {
    private String codeName;
    private String objective;
    private int riskLevel;

    public SecretMission(String codeName, String objective, int riskLevel){
        this.codeName = codeName;
        this.objective = objective;
        this.riskLevel = riskLevel;
    }

    @Override
    public String toString(){
        return " SecretMission code: " + this.codeName + " ,Objective: " + this.objective + " ,Risk Level: " + this.riskLevel;
    }
    @Override
    public int hashCode(){
        return 787;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof SecretMission){
            SecretMission secretMission1=this;
            SecretMission secretMission2=(SecretMission) obj;
            if(secretMission1.codeName==secretMission1.codeName && secretMission2.objective==secretMission2.objective){
                return true;
            }
        }
        return false;
    }
}
