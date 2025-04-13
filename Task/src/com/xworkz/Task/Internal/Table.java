package com.xworkz.Task.Internal;

import javafx.scene.control.Tab;

public class Table {
    private String material;
    private int height;
    private boolean isFoldable;

    public Table(String material, int height, boolean isFoldable){
        this.material = material;
        this.height = height;
        this.isFoldable = isFoldable;
    }

    @Override
    public String toString(){
        return " Table material: " + this.material + " ,Height: " + this.height + "cm ,Foldable: " + this.isFoldable;
    }
    @Override
    public int hashCode(){
        return 12;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Table){
            Table table1=this;
            Table table2=(Table) obj;
            if(table1.material==table1.material && table2.height==table2.height){
                return true;
            }
        }
        return false;
    }
}
