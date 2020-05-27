package com.company.lab30;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(12);
        list.add(10);
        list.add(10);
        list.add(11);
        list.add(131);
        list.add(132);
        list.add(133);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(14);
        list.add(14);
        list.add(120);
        list.add(130);

        Stream<Integer> stream = list.stream();
        stream = stream.peek((e) -> System.out.print("0. " + e));
        stream = stream.skip(1).limit(11);
        stream = stream.peek((e) -> System.out.println("1. " + e));
        stream = stream.distinct();
        stream = stream.sorted();
        stream = stream.peek((e) -> System.out.println("2. " + e));
        stream = stream.filter(a -> a % 2 != 0 && a > 10);
        stream = stream.peek((e) -> System.out.println("3. " + e));
        stream = stream.filter(a -> a <=100);
        stream = stream.peek((e) -> System.out.println("4. " + e));
        Optional<Integer> resultOptional = stream.reduce(Integer::sum);

        Integer i1 = resultOptional.get();
        Integer i2 = resultOptional.orElse(-1);
        resultOptional.orElseThrow(RuntimeException::new);
        resultOptional.ifPresent(c -> System.out.println(c));

        Integer stream2 = list.stream()
            .peek((e) -> System.out.println("0. " + e))
            .skip(1)
            .limit(11)
            .peek((e) -> System.out.println("1. " + e))
            .distinct()
            .sorted()
            .peek((e) -> System.out.println("2. " + e))
            .filter(a -> a % 2 != 0 && a > 10)
            .peek((e) -> System.out.println("3. " + e))
            .filter(a -> a <=100)
            .peek((e) -> System.out.println("4. " + e))
            .reduce(Integer::sum)
            .orElseThrow(RuntimeException::new);
    }
}
