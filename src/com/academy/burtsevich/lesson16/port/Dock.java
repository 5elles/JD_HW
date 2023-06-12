package com.academy.burtsevich.lesson16.port;

import java.util.Map;

public class Dock implements Runnable {
    private final String name;

    private static int servedShips = 0;

    Dock(int i) {
        this.name = "Причал № " + i;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public synchronized void run() {
        while (!Thread.currentThread().isInterrupted() && Service.isServiceNeeded()  ) {
            if (servedShips >= 800 && servedShips % 10 == 0 && Service.openedDocksList.size() > 1) {
                    Service.closeDock();
            } else {
                Ship ship = Service.getShip();
                toServeAShip(ship);
                servedShips++;
            }
        }
    }

    private void toServeAShip(Ship ship) {
        if (ship != null) {
            synchronized (System.out) {
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("----------------------------------------");
                System.out.println(ship.getName() + " зашел в порт. " + this.name + " назначен для разгрузки.");
                System.out.println("Опись выгруженного товара: ");
                Map<String, Integer> cargo = ship.getCargo();
                int cargoCounter = 0;
                for (Map.Entry<String, Integer> entry : cargo.entrySet()) {
                    System.out.printf("%2s. %-8s-> %s pcs. \n", ++cargoCounter, entry.getKey(), entry.getValue());
                }
                System.out.println("----------------------------------------");
            }
        }
    }
}
