package com.xworkz.Task.Internal;

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
}
