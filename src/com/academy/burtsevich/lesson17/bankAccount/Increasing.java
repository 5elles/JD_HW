package com.academy.burtsevich.lesson17.bankAccount;

public class Increasing implements Runnable {
    private final BankAccount bankAccount;
    public Increasing(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        bankAccount.increase();
    }
}
