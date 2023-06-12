package com.academy.burtsevich.lesson16;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        int threads = Thread.activeCount();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new Counter());
            thread.start();
        }


        while (threads < Thread.activeCount()){
            Thread.sleep(100);
        }
        System.out.println(Counter.counter);
    }
}

