package com.company.lab22.wait.runnable;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableClass("Second"));
        thread.start();//method ThreadsClass.run()
        System.out.println("1 -> "+thread.isInterrupted());
        thread.interrupt();
        System.out.println("2 -> "+thread.isInterrupted());
        try {
            sleep(10000);
            System.out.println(thread.getId());
            System.out.println(thread.isAlive());
            System.out.println(thread.isInterrupted());
            System.out.println(thread.getState());
            thread.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
