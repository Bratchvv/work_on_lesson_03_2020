package com.company.lab22.countdown;

import java.util.concurrent.CountDownLatch;

class Test {
    public static void main(String args[]) {
        CountDownLatch cdl = new CountDownLatch(2);
        new TestThread(cdl);
        new TestThread(cdl);
        try {
            cdl.await(); // ждем
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        System.out.println("RESULT PROCESS");
    }
}
