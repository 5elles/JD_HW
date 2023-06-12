package com.academy.burtsevich.lesson16.shop;

import java.util.Map;
import java.util.Set;

public class Cashier extends Thread {

    public Cashier(int i) {
        super("Cashier № " + i);
    }

    @Override
    public void run() {
        while (QueueContainer.isServiceNeeded()) {
            Buyer buyer = QueueContainer.removeBuyer();
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            printBill(buyer);
            QueueContainer.incrementCounter();
        }
        System.out.println(this.getName() + " завершил работу");
    }

    private void printBill(Buyer buyer) {
        if (buyer == null) {
            return;
        }
        Map<String, Integer> bucket = buyer.getBucket();
        synchronized (System.out) {
            System.out.println("_________________________________");
            System.out.println(this.getName() + "обслуживает " + buyer.getName());
            double sum = 0;
            for (Map.Entry<String, Integer> ent : bucket.entrySet()) {
                sum += ent.getValue();
                System.out.println(ent.getKey() + ": " + ent.getValue());
            }
            System.out.println("Итого сумма: " + sum);
            System.out.println("---------------------------------");

        }
    }
}
