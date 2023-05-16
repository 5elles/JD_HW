package com.academy.burtsevich.lesson10;


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            readData(scanner);
        } catch (InterruptedException | MyException e) {
            System.err.println(e.getLocalizedMessage() + e.getClass());
        }
    }

    static void readData(Scanner scanner) throws InterruptedException, MyException {
        StringBuilder stringBuilder = new StringBuilder();

        int count = 0;
        while (count < 5) {
            try {
                String s = scanner.nextLine();
                double v = Double.parseDouble(s);
                stringBuilder.insert(0, v + " ");
            } catch (NumberFormatException e) {
                Thread.sleep(100);
                System.out.println(stringBuilder);
                count += 1;
            }
        }
        throw new MyException("Было допущено 5 ошибок! ");
    }
}
