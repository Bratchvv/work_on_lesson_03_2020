package com.company.lab14.animal;

import java.math.BigDecimal;

public class TestAnimal {

    public static void main(String[] args) {

        System.out.println("Animals all jump:");
        Animal commonAnimal = new Animal("Чубака", 100);
        Dog dog = new Dog("Тузик", 15, 20);
        Cat cat = new Cat("Tom", 40, false);
        Fish fish = new Fish("Golden", 10);
        Wolf wolf = new Wolf("Волк", 10, 35);
        jumpAll(commonAnimal, dog, cat, fish, wolf);

        String animalStr = getToStringAnimal(commonAnimal);
        String dogStr = getToStringAnimal(dog);
        String catStr = getToStringAnimal(cat);
        String fishStr = getToStringAnimal(fish);
        String wolfStr = getToStringAnimal(wolf);

        String commonStr = getToStringAnimal("Моя строка");
        String numStr = getToStringAnimal(Long.valueOf(10));
        System.out.println();


        Object objWolf = wolf;
        Wolf w2 = (Wolf) objWolf;

//        String str = "asdfasdfasdf";
//        Object objString = str;
//        Wolf str2 = (Wolf) objString;

        testAnimal(cat);
        testAnimal(dog);
        testAnimal(wolf);
        testAnimal(fish);


    }

    private static String getToStringAnimal(Object animalObj) {
        return animalObj.toString();
    }


    private static void testAnimal(Animal animal) {
        BigDecimal bd = new BigDecimal(123);
        bd.add(new BigDecimal(123));
        if(animal instanceof Cat) {
            Cat c = (Cat)animal;
            c.jump();
        } else if (animal instanceof Dog) {
            Dog d = (Dog)animal;
            d.seat();
        }
    }

    private static void jumpAll(Animal ...animals){
        for (Animal a : animals){
            a.jump();
            System.out.println();
        }
    }

}
