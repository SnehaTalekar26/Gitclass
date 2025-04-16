package com.xworkz.Abstract.internal;

public class AbstractRunner {
    public static void main(String[] args) {
        Art art=new Art();
        art.draw();
        System.out.println("---------------");

        Lens lens=new Lens();
        lens.wear();
        System.out.println("---------------");

        Bisleri bisleri=new Bisleri();
        bisleri.drink();
        bisleri.save();
        System.out.println("---------------");

        Spicy spicy=new Spicy("Burger","Fast food",299);
        spicy.displayInfo();
        spicy.foodType();
        System.out.println("---------------");

        House house = new House("Villa", "Residential", 3, 250);
        house.displayArea();
    }
}
