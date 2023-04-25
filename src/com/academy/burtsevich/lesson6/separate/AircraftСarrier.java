package com.academy.burtsevich.lesson6.separate;

public class AircraftСarrier extends Warship implements Ship{
    public AircraftСarrier() {
    }

    public AircraftСarrier(int displacement, int range, String type) {
        super(displacement, range, type);
    }

    @Override
    public void getDisplacementAndRange() {
        System.out.println("_________________________________");
        System.out.println(this.getType());
        System.out.println("Водоизмещение: " + this.getDisplacement() + " т.");
        System.out.println("Дальность плавания: " + this.getRange() + " миль.");
    }

    @Override
    public void sail() {
        System.out.println("_________________________________");
        System.out.println(this.getType() + " отправился в плавание");
    }

    @Override
    public void sayToTo() {
        System.out.println("_________________________________");
        System.out.println("Ту-тууууу!");
    }
}
