package com.academy.burtsevich.lesson17.safeQueue;

public class GettingThread<V> implements Runnable {
    private final SafeQueue<V> safeQueue;

    public GettingThread(SafeQueue<V> safeQueue) {
        this.safeQueue = safeQueue;
    }

    @Override
    public void run() {
        V el = safeQueue.dequeue();
        System.out.printf("----------------------------------Извлечен элемент \"%s\"\n", el);
    }
}
