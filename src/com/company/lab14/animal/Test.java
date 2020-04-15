package com.company.lab14.animal;

public class Test {

    public static void main(String[] args) {

        System.out.println("Call static");
        Animal.run();
        System.out.println(Animal.TEST_CONST);
        Dog.run();
        System.out.println(Dog.TEST_CONST);
        Cat.run();
        System.out.println(Cat.TEST_CONST);

        System.out.println("Animal:");
        Animal commonAnimal = new Animal("Чубака", 100);
        commonAnimal.jump();
        System.out.println();

        System.out.println("Dog:");
        Dog dog = new Dog("Тузик", 15, 20);
        dog.jump();
        System.out.println();

        System.out.println("Cat:");
        Cat cat = new Cat("Tom", 40, false);
        cat.jump();
        System.out.println();

        System.out.println("Fish:");
        Fish fish = new Fish("Golden", 10);
        fish.jump();
        fish.swim();
        System.out.println();

    }

}
