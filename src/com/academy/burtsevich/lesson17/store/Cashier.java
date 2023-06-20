package com.academy.burtsevich.lesson17.store;


import java.util.Map;

public class Cashier implements Runnable {
     private final String name;

    public Cashier(int i) {
        this.name = ("Cashier № " + i);
    }

    @Override
    public void run() {
        while (QueueContainer.isServiceNeeded()) {
            Buyer buyer = QueueContainer.removeBuyer();
            printBill(buyer);
            QueueContainer.incrementCounter();
        }
        System.out.println(this.name + " завершил работу");
    }

    private void printBill(Buyer buyer) {
        if (buyer == null) {
            return;
        }
        Map<String, Integer> bucket = buyer.getBucket();
        synchronized (System.out) {
            System.out.println("_________________________________");
            System.out.println(this.name + "обслуживает " + buyer.getName());
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
