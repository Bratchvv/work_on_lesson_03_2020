package com.company.lab14.animal;

public class Dog extends Animal {
    public void jump() {
        System.out.println("No static! Dog jump");
    }
    public static void run() {
        System.out.println("Static! Dog run ");
    }
}