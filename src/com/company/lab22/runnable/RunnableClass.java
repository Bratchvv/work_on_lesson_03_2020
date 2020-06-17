package com.company.lab22.runnable;

import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.sleep;

public class RunnableClass implements Runnable {

    private String localName;

    public RunnableClass() { }

    public RunnableClass(String localName) {
        this.localName = localName;
    }

    @Override
    public void run() {
        System.out.println("Name="+localName);
        int count = 0;
        for (int i = 0; i < 100000000; i++) {
            count = i;
        }
        System.out.println("run() " + localName + " running " + count);
        try {
            sleep(ThreadLocalRandom.current().nextInt(100,500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
