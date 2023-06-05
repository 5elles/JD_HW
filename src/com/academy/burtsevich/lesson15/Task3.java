package com.academy.burtsevich.lesson15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static Integer value = 0;


    public static void main(String[] args) {
        List<NumberBooster> threads = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            NumberBooster numberBooster = new NumberBooster();
            numberBooster.start();

            if (i % 10 == 0) {
                try {
                    System.out.println("Остановка потока " + i);
                    Thread.sleep(1);
                    numberBooster.interrupt();
                    Thread.sleep(1);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                threads.add(numberBooster);
            }

            for (NumberBooster nb : threads) {
                try {
                        nb.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("Value = " + value);
    }
}
