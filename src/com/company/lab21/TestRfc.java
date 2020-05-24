package com.company.lab21;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestRfc {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        Set<String> names = new TreeSet<>();
        for (int i = 0; i < 10_000_000; i++) {
            names.add("Ivan"+ i);
        }
        System.out.println("String TreeSet time:" + (System.currentTimeMillis() - time));

        System.out.println();

        names = null;
        time = System.currentTimeMillis();
        names = new HashSet<>();
        for (int i = 0; i < 10_000_000; i++) {
            names.add(i + "Ivan");
        }
        System.out.println("String HashSet time:" + (System.currentTimeMillis() - time));

        names = null;
        time = System.currentTimeMillis();
        names = new LinkedHashSet<>();
        for (int i = 0; i < 10_000_000; i++) {
            names.add(i + "Ivan");
        }
        System.out.println("String LinkedHashSet time:" + (System.currentTimeMillis() - time));


        time = System.currentTimeMillis();
        Set<Integer> numbers = new TreeSet<>();
        for (int i = 0; i < 10_000_000; i++) {
            numbers.add(i);
        }
        System.out.println("Integer TreeSet time:" + (System.currentTimeMillis() - time));

        System.out.println();

        numbers = null;
        time = System.currentTimeMillis();
        numbers = new HashSet<>();
        for (int i = 0; i < 10_000_000; i++) {
            numbers.add(i);
        }
        System.out.println("Integer HashSet time:" + (System.currentTimeMillis() - time));

        numbers = null;
        time = System.currentTimeMillis();
        numbers = new LinkedHashSet<>();
        for (int i = 0; i < 10_000_000; i++) {
            numbers.add(i);
        }
        System.out.println("Integer LinkedHashSet time:" + (System.currentTimeMillis() - time));

    }
}
