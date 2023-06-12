package com.academy.burtsevich.lesson16;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        int threads = Thread.activeCount();
        BankAccount bankAccount = new BankAccount();

        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(new Decreasing(bankAccount));
            thread.start();
        }
        for (int i = 0; i < 2000; i++) {
            Thread thread = new Thread(new Increasing(bankAccount));
            thread.start();
        }

        while (threads < Thread.activeCount()){
            Thread.sleep(100);
        }

        System.out.println(bankAccount.balance);
    }
}
