package com.academy.burtsevich.lesson6;

import java.util.Arrays;
import java.util.Comparator;

public class Airline {
    public static double getTotalCapacity(Aircraft... aircrafts){
        int totalCapacity = 0;
        for (Aircraft aircraft : aircrafts) {
            totalCapacity += aircraft.getCapacity();
        }
        return totalCapacity;
    }
    public static double getTotalLoadCapacity(Aircraft... aircrafts){
        int loadCapacity = 0;
        for (Aircraft aircraft : aircrafts) {
            loadCapacity += aircraft.getLoadCapacity();
        }
        return loadCapacity;
    }
    public static double getAverageRange(Aircraft... aircrafts){
        int totalRange = 0;

        for (Aircraft aircraft : aircrafts) {
            totalRange += aircraft.getRange();
        }
        return (double) totalRange / aircrafts.length;
    }

    public static void sortByRange(Aircraft... aircrafts){
        Arrays.sort(aircrafts, Comparator.comparing(Aircraft::getRange));
        System.out.printf("%-15s%8s%n", "Модель", "Рег. номер");
        System.out.println("-----------------------");
        for (Aircraft aircraft: aircrafts) {
            System.out.printf("%-15s%-8s%n", aircraft.getModel(), aircraft.getRegistrationNumber());
        }
    }

    public static void searchByParameter(int capacity, int loadCapacity,  int range, Aircraft[] aircrafts) {
        for (Aircraft aircraft: aircrafts){
            if (aircraft.getCapacity() == capacity && aircraft.getLoadCapacity() == loadCapacity && aircraft.getRange() == range){
                System.out.println(aircraft.getModel() + " № " + aircraft.getRegistrationNumber());
            }
        }
    }


}
