package com.xworkz.Sneha;

public class Theater {
    public void show(Poster poster) {
        System.out.println("Running Theater");
        if (poster != null) {
            poster.showInfo();
        } else {
            System.out.println("Poster is null. Cannot show info.");
        }
    }
}
