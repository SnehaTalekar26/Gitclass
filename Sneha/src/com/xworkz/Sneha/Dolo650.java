package com.xworkz.Sneha;

public class Dolo650 {
    public void consume(Medicine medicine) {
        System.out.println("Taking Dolo650");
        if (medicine != null) {
            medicine.take();
        } else {
            System.out.println("Medicine object is null");
        }
    }
}
