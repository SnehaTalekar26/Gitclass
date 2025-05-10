package com.xworkz.Sneha;

public class Shop {
    public void ads(Display display) {
        System.out.println("Running Shop");
        if (display != null) {
            display.run();
        } else {
            System.out.println("Display is null. Cannot run ads.");
        }
    }
}
