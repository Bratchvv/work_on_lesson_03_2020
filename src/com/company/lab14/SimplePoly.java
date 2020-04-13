package com.company.lab14;

public class SimplePoly {

    public static void main(String[] args) {
        String str = "sdafgsdgfh";
        int[] arr = new int[10];

        Object strO = str;
        Object arrO = arr;

        Number i = Integer.valueOf(1000);
        Number l = Long.valueOf(1000);
        Number d = Double.valueOf(1000);
        Number f = Float.valueOf(1000);

        Number n = i.intValue() + l.longValue();
    }

}
