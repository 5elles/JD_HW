package com.academy.burtsevich.lesson16;

import java.util.ArrayDeque;

public class SafeQueue<V> {
    public static final String MONITOR = "";
    public ArrayDeque<V> deque = new ArrayDeque<>();

    void enqueue(V item){
        synchronized (MONITOR){
            deque.add(item);
            MONITOR.notifyAll();
        }
    }
    V dequeue(){
        synchronized (MONITOR){
            if (deque.size() == 0){
                try {
                    MONITOR.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            return deque.pop();
        }
    };

}
