package com.academy.burtsevich.lesson17;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
       try {
           for (int i = 0; i < 20; i++) {
               executor.execute(new Counter());
           }
       } finally {
        executor.shutdown();
       }
        try {
            executor.awaitTermination(100, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Counter.counter.get());
    }
}
