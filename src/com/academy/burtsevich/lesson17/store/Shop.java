package com.academy.burtsevich.lesson17.store;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Shop {
    public static final int BUYERS_TO_SERVE = 200;

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();
        try {
            for (int i = 0; i < 2; i++) {
                executorService.submit(new Cashier(i));
            }
        } finally {
            executorService.shutdown();
        }

        System.out.println("Магазин открыт! ");

        for (int i = 0; i < BUYERS_TO_SERVE; i++) {
            Buyer buyer = new Buyer(i);
            QueueContainer.addBuyer(buyer);
        }
    }
}
