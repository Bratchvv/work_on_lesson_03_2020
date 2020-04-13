package com.company.lab13;

import com.company.lab13.test.Dog;

public class Test {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Шарик");
        dog1.setPredator(true);

        Dog dog2 = new Dog();
        dog2.setName("Шарик");
        dog2.setPredator(true);

        System.out.println("dog1:"+dog1.hashCode());
        System.out.println("dog2:"+dog2.hashCode());

        System.out.println("dog1 == dog2: " + (dog1==dog2));//!!!!! НЕ правильно!!!
        System.out.println("dog1 равен dog2: " + dog1.equals(dog2)); //!!!!! ПРАВИЛЬНО!!!

        String str1 = "qwerty";
        String str2 = "qwerty";
        boolean strEquals = str1.equals(str2);
        System.out.println(str1 + " == " + str2 + " -> " + strEquals);

        Long l1 = 999900000L;
        Long l2 = 999900000L;
        boolean longEquals = l1.equals(l2);
        System.out.println(l1 + " == " + l2 + " -> " + longEquals);

        System.out.println(dog1.toString());
        System.out.println(dog2);
        System.out.println();
    }

}
