package com.academy.burtsevich.lesson17.bankAccount;

public class Decreasing implements Runnable{
    private final BankAccount bankAccount;

    public Decreasing(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        bankAccount.decrease();
    }
}
