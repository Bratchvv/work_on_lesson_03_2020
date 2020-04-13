package com.company.lab13.test;

import com.company.lab13.Animal;

public class Dog extends Animal {

    private String color;

    public Dog() {
        System.out.println("Dog()");
    }

    @Override
    public void voice() {
        System.out.println("Гав");
    }

    public void guard() {
        System.out.println("guard guard guard");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
