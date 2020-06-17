package com.company.lab22.countdown;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.sleep;

public class TestThread implements Runnable {
    CountDownLatch latch;

    TestThread(CountDownLatch latch) {
        this.latch = latch;
        new Thread(this).start();
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(ThreadLocalRandom.current().nextInt(100,2500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +"  "+i);
           // обратный отсчет }
        }
        latch.countDown();
    }
}
