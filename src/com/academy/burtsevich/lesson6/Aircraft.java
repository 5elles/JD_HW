package com.academy.burtsevich.lesson6;

abstract class Aircraft {
    private int capacity, loadCapacity, range;
    private String model;
    private int registrationNumber;

    public int getCapacity() {
        return capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public double getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public Aircraft() {

    }


    public Aircraft(String model, int registrationNumber, int capacity, int loadCapacity, int range) {
        this.capacity = capacity;
        this.loadCapacity = loadCapacity;
        this.range = range;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }
}
