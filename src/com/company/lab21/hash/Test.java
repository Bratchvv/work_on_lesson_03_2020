package com.company.lab21.hash;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Product p1 = new Product("Milk", "Food", 123);
        Product p2 = new Product("Bred", "Food", 12);
        Product p3 = new Product("Meat", "Food", 1222);
        Product p4 = new Product("Beer", "Drink", 123);
        Product p5 = new Product("Cola", "Drink", 222);

        Set<Product> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        System.out.println(set);
    }
}
