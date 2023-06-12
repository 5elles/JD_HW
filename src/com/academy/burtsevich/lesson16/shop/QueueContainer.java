package com.academy.burtsevich.lesson16.shop;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueContainer {
    private static final Queue<Buyer> queue = new ArrayDeque<>();
    private static int counter = 0;

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
        counter++;
    }

    public static synchronized boolean isServiceNeeded() {
        return counter <= Shop.BUYERS_TO_SERVE;
    }
}
