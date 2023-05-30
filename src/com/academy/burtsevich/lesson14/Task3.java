package com.academy.burtsevich.lesson14;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String s = File.separator;
        String rootPath = System.getProperty("user.dir") + s + "src" + s +
                "com" + s + "academy" + s + "burtsevich" + s + "lesson14";
        String inputFile = rootPath + s + "input.txt";
        String outputFile = rootPath + s + "occurrences.txt";

        try (Scanner scanner = new Scanner(
                new BufferedInputStream(
                        new FileInputStream(inputFile)
                ));
        ) {
            while (scanner.hasNext()) {
                stringBuilder.append(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        int count = 0;
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (Objects.equals(stringBuilder.charAt(i), 'a')) {
                count++;
            }
        }

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(outputFile)
        )) {
            String answer = String.format("Всего в тексте %s букв 'a'.", count);
            writer.write(answer);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
