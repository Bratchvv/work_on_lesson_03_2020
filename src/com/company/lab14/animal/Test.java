package com.company.lab14.animal;

public class Test {

    public static void main(String[] args) {
        System.out.println("Dog dog =...");
        Dog dog = new Dog();
        dog.jump(); // Динамическое связывание на основе объекта
        dog.run(); // Статическое связывание на основе класса
        System.out.println();

        System.out.println("Animal dog =...");
        Animal dog2 = new Dog();
        dog2.jump(); // Динамическое связывание на основе объекта
        dog2.run(); // Статическое связывание на основе класса
        System.out.println();

        System.out.println("Animal animal =...");
        Animal animal = new Animal();
        animal.jump(); // Динамическое связывание на основе объекта
        animal.run(); // Статическое связывание на основе класса

        System.out.println("Animal animal =...");
        Object obj = new Animal();
    }

}
