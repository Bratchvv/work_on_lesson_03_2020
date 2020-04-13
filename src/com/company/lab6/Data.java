package com.company.lab6;

public class Data {

    static int myStatic = 10;
    int notStatic = 0;

    static void test()
    {
        System.out.println("test");
    }

    @Override
    public String toString() {
        return "Data{" +
            "notStatic=" + notStatic +
            '}';
    }
}