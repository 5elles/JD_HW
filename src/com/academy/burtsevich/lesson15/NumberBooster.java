package com.academy.burtsevich.lesson15;

public class NumberBooster extends Thread {


    @Override
    public void run() {

        for (int i = 0; i < 500; i++) {
            try {
                Thread.sleep(1);
                Task3.value++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

