package com.company.lab30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsMap {

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,56,7};
        Stream<Integer> stream = Arrays.stream(arr).filter(i -> i < 50);
        Stream<String> streamStr = stream.map(i -> String.valueOf(i*10)+"str");

        String result1 = streamStr.findFirst().orElse("none");

        // TODO Погуглить как клонировать Stream
        long result2 = streamStr.count();
        boolean result3 = streamStr.anyMatch(s -> s.startsWith("30"));
        boolean result4 = streamStr.allMatch(s -> s.endsWith("str"));
        String result5= streamStr.min(String::compareTo).orElse("none");

        List<String> result10 = streamStr.collect(Collectors.toList());
        System.out.println(result10);

        result10.forEach(x -> {
            System.out.println("hello " + x);
            System.out.println(x);
        });

        for (String x : result10) {
            System.out.println("hello " + x);
            System.out.println(x);
        }

    }
}
