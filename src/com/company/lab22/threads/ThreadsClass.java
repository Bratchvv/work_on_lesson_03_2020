package com.company.lab22.threads;

public class ThreadsClass extends Thread {

    private String localName;

    public ThreadsClass() { }

    public ThreadsClass(String localName) {
        this.localName = localName;
    }

    @Override
    public void run() {
        int count = 0;
        for (int i = 0; i < 100000000; i++) {
            count = i;
        }
        System.out.println("run() " + localName + " running " + count);
    }

}
