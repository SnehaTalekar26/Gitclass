package com.xworkz.Task.Internal;

public class Pet {
    private String name;
    private String species;
    private int age;

    public Pet(String name, String species, int age){
        this.name = name;
        this.species = species;
        this.age = age;
    }

    @Override
    public String toString(){
        return " Pet name: " + this.name + " ,Species: " + this.species + " ,Age: " + this.age + " years";
    }
    @Override
    public int hashCode(){
        return 839;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Pet){
            Pet pet1=this;
            Pet pet2=(Pet)obj;
            if(pet1.name==pet1.name && pet2.species==pet2.species){
                return true;
            }
        }
        return false;
    }
}
