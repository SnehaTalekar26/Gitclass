package com.xworkz.references;

public class Minister {
    String ministerName;
    String ministerState;
    int ministerSalary;
    String ministerPosition;
    PersonalAssistant[] personalAssistant;

    Minister(String ministerName,String ministerState,int ministerSalary,String ministerPosition,PersonalAssistant[] personalAssistant){
        this.ministerName=ministerName;
        this.ministerState=ministerState;
        this.ministerSalary=ministerSalary;
        this.ministerPosition=ministerPosition;
        this.personalAssistant=personalAssistant;
    }

    public void ministerDisplay(){
        System.out.println("Minister Details");
        System.out.println("Minister Name:"+this.ministerName);
        System.out.println("Minister State:"+this.ministerState);
        System.out.println("Minister Salary:"+this.ministerSalary);
        System.out.println("Minister Position"+this.ministerPosition);
        System.out.println("-----------------------------");
        for(PersonalAssistant ref:personalAssistant){
            if(ref!=null){
                ref.personalAssistantDisplay();
                System.out.println("---------------------------------");
            }
            else
                System.err.println("Pointing to null");
        }
    }
}
