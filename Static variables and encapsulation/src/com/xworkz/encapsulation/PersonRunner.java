package com.xworkz.encapsulation;

public class PersonRunner {
    public static void main(String[] args){
        Person person=new Person("Sneha",21);

        System.out.println("Name: "+person.getName());
        System.out.println("Age: "+person.getAge());

        person.setName("Ananya");
        person.setAge(22);

        System.out.println("Updated Name: "+person.getName());
        System.out.println("Updated Age: "+person.getAge());
    }
}