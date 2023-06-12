package com.academy.burtsevich.lesson16;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        int threads = Thread.activeCount();
        SafeQueue<String> safeQueue = new SafeQueue<>();

        for (int i = 0; i < 10000; i++) {
            Thread thread = new Thread(new AddingThread<>(safeQueue, ("Знач. ") + i));
            thread.start();
        }

        for (int i = 0; i < 5000; i++) {
            Thread thread = new Thread(new GettingThread<>(safeQueue));
            thread.start();
        }

        while (threads < Thread.activeCount()) {
            Thread.sleep(100);
        }
        System.out.println(safeQueue.deque.size());


    }
}
