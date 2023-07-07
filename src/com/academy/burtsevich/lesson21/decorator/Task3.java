package com.academy.burtsevich.lesson21.decorator;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Выберите напиток по его номеру:
                1 - чай;
                2 - кофе.""");

        int customersChoice = scanner.nextInt();
        if (customersChoice < 1 || customersChoice > 2) {
            throw new RuntimeException("Ошибка в выборе напитка!!!");
        }

        Drink drink = null;
        switch (customersChoice) {
            case 1 -> drink = new Tea();
            case 2 -> drink = new Coffee();
        }

        List<Integer> choiceList = new LinkedList<>();
        System.out.println("""
                Выберите добавки по одной:
                1 - сахар;
                2 - молоко;
                3 - сироп.
                0 - приготовить напиток""");

        int selectedAdditive = scanner.nextInt();
        while (selectedAdditive != 0) {
            choiceList.add(selectedAdditive);
            selectedAdditive = scanner.nextInt();
        }

        for (int choice : choiceList) {
            switch (choice) {
                case 1 -> drink = new SugarAdder(drink);
                case 2 -> drink = new MilkAdder(drink);
                case 3 -> drink = new SyrupAdder(drink);
                default -> throw new RuntimeException("Ошибка в выборе добавки!!!");
            }
        }
        drink.makeDrink();
    }
}
