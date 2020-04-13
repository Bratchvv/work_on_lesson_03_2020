package com.company.lab5;

public class MyUtil {

    public static int calc(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int calc(long i, int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static int calc(int value1, int value2) {
        return value1 + value2;
    }

    public static long calc(long value1, long value2) {
        return value1 + value2;
    }

    public static double calc(double value1, double value2) {
        return value1 + value2;
    }

    public static int calc(int value1, int value2, int value3) {
        return value1 + value2 + value3;
    }

    private MyUtil(){};
}
