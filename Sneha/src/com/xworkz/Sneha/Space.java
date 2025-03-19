package com.xworkz.Sneha;

public class Space {
    public void showSpace(SpaceObject spaceObject) {
        System.out.println("Running space");
        if (spaceObject != null) {
            spaceObject.displayObject();
        } else {
            System.out.println("Space object is null. Cannot display.");
        }
    }
}
