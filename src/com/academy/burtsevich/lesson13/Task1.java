package com.academy.burtsevich.lesson13;

public class Task1 {

    public static void main(String[] args){
       FoodChecker checker = new FoodChecker();
       System.out.println("Вегетарианцу это понравится - " + checker.isVegetarian(FoodType.VEGETABLE, FoodType.FRUIT));
       System.out.println("Вегетарианцу это понравится - " + checker.isVegetarian(FoodType.MEAT, FoodType.FRUIT, FoodType.VEGETABLE));
       System.out.println("Вегетарианцу это понравится - " + checker.isVegetarian(FoodType.FRUIT, FoodType.MILK, FoodType.UNKNOWN));
    }
}
