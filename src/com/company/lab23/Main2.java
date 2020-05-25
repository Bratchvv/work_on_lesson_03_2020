package com.company.lab23;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main2 {

    public static void main(String[] args) {
        double d1 = 2;
        double d2 = 1.1;
        System.out.println(d1-d2);

        BigDecimal bd1 = BigDecimal.valueOf(2);
        BigDecimal bd2 = BigDecimal.valueOf(1.1);
        System.out.println(bd1.subtract(bd2));

        BigDecimal d3=new BigDecimal(1);
        BigDecimal d4=new BigDecimal(3);
        //System.out.println(d3.divide(d4)); // ошибка (3 в периоде)
        System.out.println(d3.divide(d4, 4, RoundingMode.HALF_DOWN)); // ошибки нет


        // RANDOM
        System.out.println("\nRANDOM \n");
        Random random = new Random();
        int value = random.nextInt();
        System.out.println(value);

        int min = 100;
        int max = 200;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        Map<String, String> props = System.getenv();
        System.out.println();
    }
}