package com.academy.burtsevich.lesson16;

public class Decreasing implements Runnable {
    BankAccount bankAccount;

    Decreasing(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        bankAccount.decrease();
    }
}
