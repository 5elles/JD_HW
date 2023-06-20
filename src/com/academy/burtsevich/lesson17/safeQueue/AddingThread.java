package com.academy.burtsevich.lesson17.safeQueue;

public class AddingThread<V> implements Runnable {
    private final SafeQueue<V> safeQueue;
    private final V el;

    public AddingThread(SafeQueue<V> safeQueue, V el) {
        this.safeQueue = safeQueue;
        this.el = el;
    }

    @Override
    public void run() {
        safeQueue.enqueue(el);
        System.out.printf("Добавлен элемент \"%s\"\n", el);
    }
}
