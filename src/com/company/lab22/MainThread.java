package com.company.lab22;

import static java.lang.Thread.sleep;

public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread(); // получаем главный поток
        System.out.println(t.getName()); // main

    }
}
