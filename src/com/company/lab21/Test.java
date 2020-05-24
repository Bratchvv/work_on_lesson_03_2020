package com.company.lab21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Test {

    public static void main(String[] args) {
        Collection<String> list1 = new ArrayList<>();
        List<Long> list2 = new LinkedList<>();
        Iterable<Integer> list3 = new Stack<>();

        Collection<String> set1 = new HashSet<>();
        Set<String> set2 = new LinkedHashSet<>();

        test(list2);


        List<String> cars = new ArrayList<>();
        // добавим в список ряд элементов
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("Mazda");
        cars.add("Audi");
        cars.add(1, "ZaZ"); // добавляем элемент по индексу 1
        System.out.printf("ArrayList size %d \n", cars.size());
        for(String car : cars){
            System.out.println(car);
        }

        if(cars.contains("Audi")){
            System.out.println("ArrayList contains Audi");
        }

        cars.remove("ZaZ");// удаление конкретного элемента
        cars.remove(2);// удаление по индексу
        Object[] peopleArray = cars.toArray();
        for(Object person : peopleArray){
            System.out.println(person);
        }

        System.out.println();
        System.out.println();
        Set<String> names = new TreeSet<>();
        names.add("Ivan");
        names.add("Kolya");
        names.add("Sasha");
        names.add("Sveta");
        names.add("Alex");
        names.add("Ivan");

        for (String name: names){
            System.out.println(name);
        }


    }

    static void test(List<?> collection){
        System.out.println("");
    }

}
