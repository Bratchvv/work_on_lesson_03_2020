package com.company.lab22.threads;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        Thread thread =  new ThreadsClass("Second");
        Thread thread2 =  new ThreadsClass("Third");
        Thread thread3 =  new ThreadsClass("Fourth");
        Thread thread31 =  new ThreadsClass("1");
        Thread thread32 =  new ThreadsClass("2");
        Thread thread33 =  new ThreadsClass("3");
        Thread thread34 =  new ThreadsClass("4");
        Thread thread35 =  new ThreadsClass("5");
        Thread thread36 =  new ThreadsClass("6");
        Thread thread37 =  new ThreadsClass("7");
        Thread thread38 =  new ThreadsClass("8");

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
