package com.academy.burtsevich.lesson6.separate;

abstract class Car {
    private String brand, model, fuel;
    private int year, tankCapacity, doors;
    private double fuelConsumption, price;

    public Car(String brand, String model, String fuel, int year, int tankCapacity, int doors, double fuelConsumption, double price) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.year = year;
        this.tankCapacity = tankCapacity;
        this.doors = doors;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
