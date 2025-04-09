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
}
