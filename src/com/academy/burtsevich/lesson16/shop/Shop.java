package com.academy.burtsevich.lesson16.shop;

public class Shop {
    public static final int BUYERS_TO_SERVE = 200;

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            new Cashier(i).start();
        }

        System.out.println("Магазин открыт! ");

        for (int i = 0; i < BUYERS_TO_SERVE; i++) {
            Buyer buyer = new Buyer(i);
            QueueContainer.addBuyer(buyer);
        }
    }
}
