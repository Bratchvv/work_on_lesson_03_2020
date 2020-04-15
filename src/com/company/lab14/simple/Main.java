package com.company.lab14.simple;

public class Main {

    public static void main(String[] args) {
        Specific specific = new Specific();
        Simple simple = specific;
        System.out.println(specific.data + " " + simple.data); // раннее связывание
        System.out.println(specific.getData() + " " + simple.getData()); // позднее связывание
    }
}
