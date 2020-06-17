package com.company.lab22.wait.runnable;

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
        try {
            System.out.println("Before wait");
            sleep(5000);
            System.out.println("After wait");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("run() " + localName + " running " + count);
    }

}
