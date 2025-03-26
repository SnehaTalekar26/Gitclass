package com.xworkz.references;

public class Personnel {
    String pName;
    Skill skill;
    States state;
    Personnel(String pName,Skill skill,States state){
        this.pName=pName;
        this.skill=skill;
        this.state=state;
    }
    void personnelDisplay(){
        System.out.println("Personnel Name:"+this.pName);

        if(this.skill!=null){
            this.skill.skillDisplay();
        }
        if(this.state!=null){
            state.stateDisplay();
        }
        else
            System.err.println("Pointing to null");
    }
}
