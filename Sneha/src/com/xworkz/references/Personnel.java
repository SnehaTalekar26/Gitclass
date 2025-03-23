package com.xworkz.references;

public class Personnel {
    String personnelName;
    Skill skill;
    States state;
    Personnel(String personnelName,Skill skill,States state){
        this.personnelName=personnelName;
        this.skill=skill;
        this.state=state;
    }
    void personnelDisplay(){
        System.out.println("Personnel Name:"+this.personnelName);

        if(this.skill!=null){
            this.skill.skillDisplay();
        }
        if(this.state!=null){
            this.state.stateDisplay();
        }
        else
            System.err.println("Pointing to null");
    }
}
