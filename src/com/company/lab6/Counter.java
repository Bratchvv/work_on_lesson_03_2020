package com.company.lab6;

public class Counter {

    public static int counter = 1;
    public int variable = 10;

    public Counter() {
        counter++;
        variable++;
        System.out.println(counter + " " + variable);
    }

    static void test()
    {
        System.out.println("test");
    }
}
