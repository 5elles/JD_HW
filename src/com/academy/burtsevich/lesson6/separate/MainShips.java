package com.academy.burtsevich.lesson6.separate;

public class MainShips {
    public static void main(String[] args) {
        AircraftСarrier aircraftСarrier = new AircraftСarrier(93400, 10000,"USS Enterprise");

        aircraftСarrier.getDisplacementAndRange();
        aircraftСarrier.sail();
        aircraftСarrier.sayToTo();
    }
}
