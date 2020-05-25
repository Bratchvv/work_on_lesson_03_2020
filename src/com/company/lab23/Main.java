package com.company.lab23;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // long l = 12334554657456243523523454364575676345324L;
        BigInteger b1 = new BigInteger("12334554657456243523523454364575676345324");
        BigInteger b2 = BigInteger.ONE;
        BigInteger b3 = BigInteger.valueOf(1234);

        long time = System.currentTimeMillis();
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < 100000000; i++) {
            result = result.add(BigInteger.ONE);
        }
        System.out.println("BigInteger. Через константу " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        result = new BigInteger("0");
        for (int i = 0; i < 100000000; i++) {
            result = result.add(new BigInteger("1"));
        }
        System.out.println("BigInteger. Через new " + (System.currentTimeMillis() - time));

        //BIG DECIMAL//
        // double d = 12334554657456243523523454364575676345.8678456456456454679324;
        BigDecimal bd1 = new BigDecimal("12334554657456243523523454364575676345.8678456456456454679324");
        BigDecimal bd2 = BigDecimal.ONE;
        BigDecimal bd3 = BigDecimal.valueOf(1234.54456);

        time = System.currentTimeMillis();
        BigDecimal resultBd = BigDecimal.ZERO;
        for (int i = 0; i < 100000000; i++) {
            resultBd = resultBd.add(BigDecimal.ONE);
        }
        System.out.println("BigDecimal. Через константу " + (System.currentTimeMillis() - time));

        time = System.currentTimeMillis();
        resultBd = new BigDecimal("0.0");
        for (int i = 0; i < 100000000; i++) {
            resultBd = resultBd.add(new BigDecimal("1.0"));
        }
        System.out.println("BigDecimal. Через new " + (System.currentTimeMillis() - time));

    }
}
