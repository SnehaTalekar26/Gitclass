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
    @Override
    public int hashCode(){
        return 28;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Cupboard){
            Cupboard cupboard1=this;
            Cupboard cupboard2=(Cupboard) obj;
            if(cupboard1.shelves==cupboard1.shelves && cupboard2.material==cupboard2.material){
                return true;
            }
        }
        return false;
    }
}
