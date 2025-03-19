package com.xworkz.Sneha;

class Mango {
    public void eat(Fruit fruit) {
        System.out.println("Eating Mango");
        if (fruit != null) {
            fruit.taste();
        } else {
            System.out.println("Fruit object is null");
        }

    }
}
