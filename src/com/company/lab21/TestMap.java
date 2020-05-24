package com.company.lab21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMap {

    public static void main(String[] args) {
        Map<Integer, String> cars = new HashMap<>();
        cars.put(1, "Lexus");
        cars.put(2, "Mersedes");
        cars.put(4, "Ford");
        cars.put(3, "Fiat");
        String first = cars.get(2); // получим объект по ключу 2
        System.out.println(first);
        Set<Integer> keys = cars.keySet(); // получим весь набор ключей
        Collection<String> values = cars.values(); // получить набор всех значений
        cars.replace(1, "Honda"); //заменить элемент
        cars.remove(2);// удаление элемента по ключу 2 перебор элементов

        for(Map.Entry<Integer, String> item : cars.entrySet()){
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }

    }
}
