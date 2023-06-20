package com.academy.burtsevich.lesson17.safeQueue;

import java.util.ArrayDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SafeQueue<V> {
    public ConcurrentLinkedQueue<V> deque = new ConcurrentLinkedQueue<>();

    void enqueue(V item) {
        deque.add(item);
    }

    V dequeue() {
        return deque.poll();
    }
}