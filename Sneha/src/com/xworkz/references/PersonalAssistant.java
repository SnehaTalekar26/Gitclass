package com.xworkz.references;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class PersonalAssistant {
    String paName;
    int paAge;
    int paExperience;
    Security security;

    public PersonalAssistant(String paName,int paAge,int paExperience,Security security){
        this.paName=paName;
        this.paAge=paAge;
        this.paExperience=paExperience;
        this.security=security;
    }
    public void personalAssistantDisplay(){
        System.out.println("Personal Assistant Details:");
        System.out.println("Personal Assistant Name:"+this.paName);
        System.out.println("Personal Assistant Age"+this.paAge);
        System.out.println("Personal Assistant Experience"+this.paExperience);
        System.out.println("-------------------------------");
        if(this.security!=null){
            this.security.securityDisplay();
        }
    }
}

