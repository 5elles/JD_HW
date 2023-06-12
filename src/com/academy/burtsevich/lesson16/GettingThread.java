package com.academy.burtsevich.lesson16;

public class GettingThread<V> implements Runnable {
    private final SafeQueue<V> safeQueue;
    GettingThread(SafeQueue<V> safeQueue){
        this.safeQueue = safeQueue;
    }

    @Override
    public void run() {
        safeQueue.dequeue();
    }
}
