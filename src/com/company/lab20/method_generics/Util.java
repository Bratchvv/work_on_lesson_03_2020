package com.company.lab20.method_generics;


public class Util {

    public static <T extends Number> T getMiddle(T... t) {
        return t[t.length / 2];
    }

    private Util() {}
}
