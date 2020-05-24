package com.company.lab21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestListRfc {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            names.add("Ivan"+ i);
        }
        System.out.println("String ArrayList time:" + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        names = new ArrayList<>(10_000_000);
        for (int i = 0; i < 10_000_000; i++) {
            names.add(i + "Ivan");
        }
        System.out.println("String ArrayList (init) time:" + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        names = new LinkedList<>();
        for (int i = 0; i < 10_000_000; i++) {
            names.add(i + "Ivan");
        }
        System.out.println("String LinkedList time:" + (System.currentTimeMillis() - time));

    }
}
