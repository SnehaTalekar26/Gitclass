package com.xworkz.Task.Internal;

public class Cupboard {
    private int shelves;
    private String material;
    private boolean hasMirror;

    public Cupboard(int shelves, String material, boolean hasMirror){
        this.shelves = shelves;
        this.material = material;
        this.hasMirror = hasMirror;
    }

    @Override
    public String toString(){
        return " Cupboard shelves: " + this.shelves + " ,Material: " + this.material + " ,Has Mirror: " + this.hasMirror;
    }
}
