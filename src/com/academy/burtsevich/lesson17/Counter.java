package com.academy.burtsevich.lesson17;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter implements Runnable{
    public static AtomicInteger counter = new AtomicInteger(0);

    void increment() {
        counter.incrementAndGet();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            increment();
        }
    }
}
