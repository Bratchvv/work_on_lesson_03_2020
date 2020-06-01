package com.company.lab24;

public class Test {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
        Singleton singleton4 = Singleton.getInstance();

        System.out.println(singleton == singleton1);
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton2 == singleton3);
        System.out.println(singleton3 == singleton4);
    }
}
