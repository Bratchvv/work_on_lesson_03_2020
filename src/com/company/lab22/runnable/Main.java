package com.company.lab22.runnable;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Thread threadDeamon = new Thread(new RunnableClass("Deamon"));
        threadDeamon.setDaemon(true);

        Thread thread = new Thread(new RunnableClass("Second"));
        Thread thread2 = new Thread(new RunnableClass("Third"));
        Thread thread3 = new Thread(new RunnableClass("Fourth"));
        Thread thread31 = new Thread(new RunnableClass("1"));
        Thread thread32 = new Thread(new RunnableClass("2"));
        Thread thread33 = new Thread(new RunnableClass("3"));
        Thread thread34 = new Thread(new RunnableClass("4"));
        Thread thread35 = new Thread(new RunnableClass("5"));
        Thread thread36 = new Thread(new RunnableClass("6"));
        Thread thread37 = new Thread(new RunnableClass("7"));
        Thread thread38 = new Thread(new RunnableClass("8"));

        threadDeamon.setName("DEAMON");
        threadDeamon.start();

        thread.setPriority(1);
        thread.start();//method ThreadsClass.run()
        thread31.start();//method ThreadsClass.run()
        thread32.start();//method ThreadsClass.run()
        thread33.start();//method ThreadsClass.run()
        thread34.start();//method ThreadsClass.run()
        thread35.start();//method ThreadsClass.run()
        thread36.start();//method ThreadsClass.run()
        thread37.start();//method ThreadsClass.run()
        thread38.start();//method ThreadsClass.run()
        thread3.start(); //method ThreadsClass.run()
        thread2.setPriority(10);
        thread2.start(); //method ThreadsClass.run()


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
