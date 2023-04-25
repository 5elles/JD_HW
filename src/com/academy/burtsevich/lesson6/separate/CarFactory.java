package com.academy.burtsevich.lesson6.separate;

public class CarFactory {
    public static double getSalesProceeds(Car[] cars){
        double revenue = 0;
        for (Car car: cars){
            revenue += car.getPrice();
        }
        return revenue;
    }

    public static double getAveragePrice(Car[] cars){
        double totalRevenue = 0;
        for (Car car: cars){
            totalRevenue += car.getPrice();
        }
        return totalRevenue / cars.length;
    }

}
