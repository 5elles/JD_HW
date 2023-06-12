package com.academy.burtsevich.lesson16.port;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

import static java.lang.Thread.sleep;

public class Service implements Runnable {
    public static final int NUMBER_OF_DOCKS = 20;
    public static int openedDocksCounter = 0;
    private static int shipsCounter = 0;

    public static final String MONITOR = "";
    public static final String MONITOR2 = " ";
    public static final Queue<Ship> shipsQueue = new ArrayDeque<>();
    public static final LinkedList<Thread> openedDocksList = new LinkedList<>();
    int th = Thread.activeCount();


    public static synchronized boolean isNewDockToOpenNeeded() {
        return (
                openedDocksCounter == 0 || openedDocksCounter < NUMBER_OF_DOCKS
        );
    }

    public static synchronized boolean isDockToCloseNeeded() {
        return openedDocksCounter > 1;
    }

    public static synchronized boolean isServiceNeeded() {
        return shipsQueue.size() > 0;
    }

    public static void addShip(Ship ship) {
        synchronized (MONITOR) {
            shipsQueue.add(ship);
            shipsCounter++;
        }
    }

    public static Ship getShip() {
        synchronized (MONITOR) {
            return shipsQueue.poll();
        }
    }

    public static void openDock() {
        Dock dock = new Dock(++openedDocksCounter);
        System.out.println("\n ++++++++++++++++++++++++ " + dock.getName() + " открыт ++++++++++++++++++++++++ \n");
        Thread thread = new Thread(dock);
        thread.setName(dock.getName());
        thread.start();
        openedDocksList.add(thread);
    }


    public static synchronized void closeDock() {

        Thread t = openedDocksList.poll();
        if (t != null) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            t.interrupt();
            System.out.println(" xxxxxxxxxxxxxxxxxxxxx " + t.getName() + " закрыт xxxxxxxxxxxxxxxxxxxx ");
            openedDocksCounter--;

        }
    }

    @Override
    public void run() {
        for (int i = 0; i < Port.SHIPS_TO_SERVE; i++) {
            Service.addShip(new Ship(i + 1));
            if (i < 800 && isNewDockToOpenNeeded()) {
                synchronized (MONITOR2) {
                    if (i % 10 == 0) {

                        try {
                            sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        openDock();
                    }
                }

            }
        }
    }

}
