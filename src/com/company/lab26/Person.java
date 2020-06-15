package com.company.lab26;

import java.io.Serializable;

class Person implements Serializable {
    public static final long serialVersionUID = 1L;

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

