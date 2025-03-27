package com.xworkz.StaticVariable;

public class StaticExample {
    static int staticVar;

    static {
        System.out.println("Running Static block");
        staticVar = 100;
    }
    StaticExample() {
        System.out.println("Running Constructor");
    }
    static void display() {
        System.out.println("Static variable value: " + staticVar);
    }
}
