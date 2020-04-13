package com.company.lab14;

import static java.lang.Thread.sleep;

public class TestEquals {

    public static void main(String[] args) throws InterruptedException {
        sleep(5000);
        long counter = Integer.MAX_VALUE * 3L;
        System.out.println("INIT");
        int v1 = 10;
        int v2 = 10;
        System.out.println("Считаем примитивы");
        long time = System.currentTimeMillis();
        for (long i = 0; i < counter; i++) {
            boolean result = v1 == v2;
        }
        System.out.println("Время примитивы ==, "+ (System.currentTimeMillis() - time));
        System.out.println();

        System.out.println("Считаем обертки из кеша");
        Integer x1 = 10220000;
        Integer x2 = 10220000;
        time = System.currentTimeMillis();
        for (long i = 0; i < counter; i++) {
            boolean result = x1 == x2;
        }
        System.out.println("Время обертки из кеша ==, "+ (System.currentTimeMillis() - time));
        System.out.println();

        System.out.println("Считаем обертки из кеша (equals)");
        Integer z1 = 10;
        Integer z2 = 10;
        time = System.currentTimeMillis();
        for (long i = 0; i < counter; i++) {
            boolean result = z1.equals(z2);
        }
        System.out.println("Время обертки из кеша (equals), "+ (System.currentTimeMillis() - time));
        System.out.println();

        System.out.println("Считаем обертки НЕ из кеша (equals)");
        Integer y1 = 99999910;
        Integer y2 = 99999910;
        time = System.currentTimeMillis();
        for (long i = 0; i < counter; i++) {
            boolean result = y1.equals(y2);
        }
        System.out.println("Время обертки НЕ из кеша equals, "+ (System.currentTimeMillis() - time));

    }

}
