package com.academy.burtsevich.lesson6.separate;

public class MainCarFactory {
    public static void main(String[] args) {
        Truck truck1 = new Truck("Scania", "G400", "diesel", 2019, 1150, 2, 30, 120000);
        Truck truck2 = new Truck("Iveco", "TRAKKER AD260T36", "diesel", 2021, 500, 2, 45, 90000);
        Sedan sedan1 = new Sedan("Volkswagen", "Passat (B8)", "petrol", 2017, 59, 4, 5.3, 30000);
        Sedan sedan2 = new Sedan("Volkswagen", "Jetta", "petrol", 2019, 50, 5, 5.3, 25000);

        Car[] cars = {truck1, truck2, sedan1, sedan2};

        sedan1.getRange();
        System.out.println("_____________________");
        System.out.println("Средняя стоимость производимых автомобилей: " + CarFactory.getAveragePrice(cars));
        System.out.println("_____________________");
        System.out.println("Выручка завода от продажи автомобилей: " + CarFactory.getSalesProceeds(cars));
    }
}
