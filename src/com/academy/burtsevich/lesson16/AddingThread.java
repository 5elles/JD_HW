package com.academy.burtsevich.lesson16;

public class AddingThread<V> implements Runnable{
    private final SafeQueue<V> safeQueue;
    private final V element;

    AddingThread(SafeQueue<V> safeQueue, V element){
        this.safeQueue = safeQueue;
        this.element = element;
    }

    @Override
    public void run() {
        safeQueue.enqueue(element);
    }
}
