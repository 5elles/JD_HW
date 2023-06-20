package com.academy.burtsevich.lesson17.port;

import java.util.Map;
import java.util.concurrent.Semaphore;

public class Dock implements Runnable {
    public final String name;
    private final Semaphore semaphore;

    public Dock(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        while (!Service.shipsQueue.isEmpty()) {
            int servedShips = Service.numberOfServedShips.get();


            Service.numberOfServedShips.incrementAndGet();
            Ship ship = Service.shipsQueue.poll();
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            StringBuilder cargoStringBuilder = new StringBuilder();
            for (Map.Entry<String, Integer> entry : ship.getCargo().entrySet()) {
                cargoStringBuilder.append(entry.getKey() + " : " + entry.getValue() + ";\n");
            }
            try {
                semaphore.acquire();
                System.out.printf("_______________________\n%s -> %s назначен для разгрузки.\n" +
                        "Опись выгруженных товаров:\n" +
                        cargoStringBuilder + "\n_______________________\n", ship.name, this.name);
                semaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (servedShips > 800 &&
                    servedShips % 10 == 0 &&
                    Service.openedDocksNumber.get() > 1) {
                Service.openedDocksNumber.decrementAndGet();

                try {
                    semaphore.acquire();
                    System.out.println(
                            "                                      +++++++++++++ " + this.name + " закрыт +++++++++++++"
                    );
                    semaphore.release();
                    this.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            if (servedShips < 700
                    && Service.openedDocksNumber.get() < Service.MAX_NUMBER_OF_DOCKS
                    && servedShips != 0
                    && servedShips % 10 == 0) {
                Service.openADock();
            }
        }
        if (Service.numberOfServedShips.get() == Service.MAX_NUMBER_OF_SHIPS) {
            Service.executorService.shutdown();
        }
    }
}
