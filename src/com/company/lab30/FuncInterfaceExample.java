package com.company.lab30;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FuncInterfaceExample {

    public static void main(String[] args) {
        Predicate<Integer> isPositive = x -> x > 0;
        System.out.println(isPositive.test(5)); // true
        System.out.println(isPositive.test(-7)); // false

        BinaryOperator<Integer> multiply = (x, y) -> x*y;
        BinaryOperator<Long> multiplyNegative = (x, y) -> x*y*(-1);

        System.out.println(multiply.apply(3, 5)); // 15
        System.out.println(multiplyNegative.apply(10L, -2L)); // -20

        UnaryOperator<Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // 25

        Function<Integer, String> convert = x -> String.valueOf(x) + " долларов";
        System.out.println(convert.apply(5)); // 5 долларов


        Consumer<Integer> printer = x -> System.out.printf("%d долларов \n", x);
        printer.accept(600); // 600 долларов


        Supplier<User> userFactory = () -> {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String name = in.nextLine();
            return new User(name);
        };
        User user1 = userFactory.get();
        User user2 = userFactory.get();
        System.out.println("Имя user1: " + user1.getName());
        System.out.println("Имя user2: " + user2.getName());


        Function<String, User> userFunction = (userName) -> new User(userName);
        Function<String, User> userFunction2 = User::new;

    }
}
