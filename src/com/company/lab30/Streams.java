package com.company.lab30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        Integer[] arr = {1,2,3,4,56,7};
        Stream<Integer> stream2 = Arrays.stream(arr);

        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3", "a4", "a5", "a6", "b1");

        String[] array = {"a1","a2","a3"};
        Stream<String> streamFromArrays = Arrays.stream(array);
    }
}
