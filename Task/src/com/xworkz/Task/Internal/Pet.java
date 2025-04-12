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
}
