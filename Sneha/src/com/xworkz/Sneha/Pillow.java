package com.xworkz.Sneha;

class Pillow {
    public void sleep(Person person) {
        System.out.println("Running Pillow");
        if (person != null) {
            person.rest();
        } else {
            System.out.println("Person object is null");
        }
    }
}