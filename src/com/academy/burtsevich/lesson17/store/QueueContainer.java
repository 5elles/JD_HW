package com.academy.burtsevich.lesson17.store;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class QueueContainer {
    private static final BlockingDeque<Buyer> queue = new LinkedBlockingDeque<>() {
    };
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void addBuyer(Buyer buyer) {
        synchronized (queue) {
            queue.add(buyer);
        }
    }

    public static Buyer removeBuyer() {
        synchronized (queue) {
            return queue.poll();
        }
    }

    public static synchronized void incrementCounter() {
        counter.incrementAndGet();
    }

    public static synchronized boolean isServiceNeeded() {
        return counter.get() <= Shop.BUYERS_TO_SERVE;
    }
}
