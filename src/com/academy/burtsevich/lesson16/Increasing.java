package com.academy.burtsevich.lesson16;

public class Increasing implements Runnable{
    BankAccount bankAccount;

    Increasing(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }
    @Override
    public void run() {
        bankAccount.increase();
    }
}
