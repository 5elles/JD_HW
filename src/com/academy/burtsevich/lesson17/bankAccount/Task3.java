package com.academy.burtsevich.lesson17.bankAccount;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Task3 {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        ExecutorService executorService = Executors.newCachedThreadPool();
        int numOfIncreasingThrds = 200;
        int numOfDecreasingThrds = 100;
        try {
            for (int i = 0; i < numOfIncreasingThrds; i++) {
                executorService.submit(new Increasing(bankAccount));
            }
            for (int i = 0; i < numOfDecreasingThrds; i++) {
                executorService.submit(new Decreasing(bankAccount));
            }
        } finally {
            executorService.shutdown();
        }

        try {
            executorService.awaitTermination(100, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.printf("Произведено:\n" +
                "%s операций зачисления средств.\n" +
                "%s операций списания средств.\n" +
                "Итоговый баланс = %s"
        , numOfIncreasingThrds, numOfDecreasingThrds,
                bankAccount.count);

    }


}
