package com.xworkz.Sneha;

public class Rocket {
    public void launch(Engine engine) {
        System.out.println("Running Rocket");
        if (engine != null) {
            engine.start();
        } else {
            System.out.println("Engine is null. Cannot display.");
        }
    }
}
