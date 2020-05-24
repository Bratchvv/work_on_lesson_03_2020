package com.company.lab21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class IteratorTest {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        // добавим в список ряд элементов
        cars.add("Toyota");
        cars.add("Lexus");
        cars.add("Mazda");
        cars.add("Audi");
        cars.add("Honda");
        cars.add("Nissan");
        cars.add("Skoda");
        cars.add("Kia");

        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()){
            String item = iterator.next();
            if(item.startsWith("N")) {
                iterator.remove();
            }
        }

        ListIterator<String> listIterator = cars.listIterator();
        while (listIterator.hasNext()){
            String item = listIterator.next();
            listIterator.add("Lanos");
            if(item.startsWith("N")) {
                listIterator.remove();
            }
        }

    }

}
