package com.company.lab5;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        com.company.lab5.Car c = new com.company.lab5.Car("Mers", "E200", "WHITE");
        checkKpp(c);
        Arrays.sort(new int[3]);
        java.util.Date d = new java.util.Date();
        Date d2 = new Date(2003,2,1);
        long millis = System.currentTimeMillis();
        Date d3 = new Date(millis);

        String s = "2010-10-12";
        String[] sarr = s.split("-");
        java.util.Date d4 = new java.util.Date(Integer.valueOf(sarr[0])-1900,Integer.valueOf(sarr[1])-1,Integer.valueOf(sarr[2]));
        System.out.println(d);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        Arrays.toString(sarr);
    }

    static void checkKpp( Car c){
        System.out.println("Чтото проверяем");
        c.setAutomat(true);
    }

}
