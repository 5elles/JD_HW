package com.academy.burtsevich.lesson6.separate;

public class Truck extends Car implements Vehicle{
    public Truck(String brand, String model, String fuel, int year, int tankCapacity, int doors, double fuelConsumption, double price) {
        super(brand, model, fuel, year, tankCapacity, doors, fuelConsumption, price);
    }

    @Override
    public void getRange() {
        System.out.println("_____________________");
        System.out.println(this.getBrand() + " " + this.getModel());
        System.out.println("Минимальное расстояние без дозаправки - " + this.getTankCapacity() / this.getFuelConsumption() * 100);
    }
}
