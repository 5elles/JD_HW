package com.academy.burtsevich.lesson17.safeQueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        SafeQueue<String> safeQueue = new SafeQueue<>();
        int countToAdd = 1250;
        int countToGet = 650;
        


        try {
            for (int i = 0; i < countToAdd; i++) {
                executorService.submit(new AddingThread<String>(safeQueue, "значение " + (i+1)));
            }

            for (int i = 0; i < countToGet; i++) {
                executorService.submit(new GettingThread<String>(safeQueue));
            }
        } finally {
            executorService.shutdown();
        }

        try {
            executorService.awaitTermination(100, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("--------------------------------------");
        System.out.printf("В очередь было добавлено %s элементов, извлечено %s элементов. \nОсталось %s элементов",countToAdd, countToGet, safeQueue.deque.size());
    }

}
