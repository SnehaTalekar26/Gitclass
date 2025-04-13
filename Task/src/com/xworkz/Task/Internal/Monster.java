package com.xworkz.Task.Internal;

public class Monster {
    private String name;
    private int scareLevel;
    private boolean hasWings;

    public Monster(String name, int scareLevel, boolean hasWings){
        this.name = name;
        this.scareLevel = scareLevel;
        this.hasWings = hasWings;
    }

    @Override
    public String toString(){
        return " Monster name: " + this.name + " ,Scare Level: " + this.scareLevel + " ,Has Wings: " + this.hasWings;
    }
    @Override
    public int hashCode(){
        return 827;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Monster){
            Monster monster1=this;
            Monster monster2=(Monster) obj;
            if(monster1.name==monster1.name && monster2.scareLevel==monster2.scareLevel){
                return true;
            }
        }
        return false;
    }
}
