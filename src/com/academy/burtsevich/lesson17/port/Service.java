package com.academy.burtsevich.lesson17.port;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class Service {
    public static final int MAX_NUMBER_OF_DOCKS = 20;
    public static final int MAX_NUMBER_OF_SHIPS = 1000;
    public static AtomicInteger openedDocksNumber = new AtomicInteger(0);
    public static AtomicInteger numberOfServedShips = new AtomicInteger(0);
    public static LinkedBlockingQueue<Ship> shipsQueue = new LinkedBlockingQueue<>();
    public static ExecutorService executorService = Executors.newCachedThreadPool();
    public static Semaphore semaphore = new Semaphore(1);


    public Service() {
        bornAShip();
        openADock();
    }

    public static void openADock() {
        Dock dock = new Dock("Причал " + openedDocksNumber.incrementAndGet(), semaphore);
        executorService.submit(dock);

        try {
            semaphore.acquire();
            System.out.println(
                    "                            +++++++++++++ " + dock.name + " открыт +++++++++++++"
            );
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void bornAShip() {
        for (int i = 0; i < MAX_NUMBER_OF_SHIPS; i++) {
            Ship ship = new Ship("Корабль " + (i + 1));
            shipsQueue.add(ship);
        }
    }
}
