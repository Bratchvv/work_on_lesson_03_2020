package com.company.lab22.pool;

import com.company.lab22.runnable.RunnableClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {
    public static void main(String[] args) {
        // создание  pool
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 100; i++) { // создание потоков
            Runnable worker = new RunnableClass("Thread_" + i); // добавление потока в pool
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }
}
