package com.company.lab7.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Integer i = 12;
        Long l = 100000000L;
        Float f = 100.20f;

        Integer i2 = Integer.valueOf(45);
        Integer i3 = new Integer(45);
        Integer im = Integer.MAX_VALUE;

        Long l2 = Long.valueOf(45L);
        Long l3 = new Long(45L);
        Long lm = null;

        Double dl = 45d;
        Double d2 = Double.valueOf(test(10, "2.25"));
        Double d3 = new Double(45L*5);
        Double dm = Double.MAX_VALUE;
        Double dn = l2.doubleValue();
        long l10 = 100;


        Boolean b = true;
        Boolean bn = null;
        Boolean b2 = new Boolean(true);
        Boolean b3 = Boolean.valueOf("true");

        Boolean b4 =  Boolean.FALSE;
        Boolean b41 = Boolean.FALSE;
        Boolean b42 = Boolean.FALSE;
        Boolean b43 = Boolean.FALSE;
        Boolean b44 = Boolean.FALSE;
        Boolean b45 = Boolean.FALSE;
    }

    private static double test(int a, String b) {
        return a + Double.parseDouble(b);
    }
}
