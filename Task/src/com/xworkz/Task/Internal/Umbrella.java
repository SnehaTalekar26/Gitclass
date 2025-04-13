package com.xworkz.Task.Internal;

public class Umbrella {
    private String color;
    private boolean isAutomatic;
    private int size;

    public Umbrella(String color, boolean isAutomatic, int size){
        this.color = color;
        this.isAutomatic = isAutomatic;
        this.size = size;
    }

    @Override
    public String toString(){
        return " Umbrella color: " + this.color + " ,Automatic: " + this.isAutomatic + " ,Size: " + this.size + " inches";
    }
    @Override
    public int hashCode(){
        return 11;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Umbrella){
            Umbrella umbrella1=this;
            Umbrella umbrella2=(Umbrella) obj;
            if(umbrella1.color==umbrella1.color && umbrella2.isAutomatic==umbrella2.isAutomatic){
                return true;
            }
        }
        return false;
    }
}
