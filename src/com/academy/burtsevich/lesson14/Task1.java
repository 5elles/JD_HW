package com.academy.burtsevich.lesson14;

import java.io.*;
import java.util.Random;

public class Task1 {
    public static void main(String[] args){
        int[][] matrix = new int[6][4];
        String s = File.separator;
        String path = System.getProperty("user.dir") +
                s + "src" + s + "com" + s + "academy" + s +
                "burtsevich" + s + "lesson14" + s;
        String fileName = "matrix.txt";
        String fullPath = path + fileName;

        Random random = new Random();
        for (int i = 0; i < matrix.length; i++){
            for (int j=0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextInt(-15, 15);
            }
        }

        try(FileWriter writer = new FileWriter(fullPath)) {
            PrintWriter printWriter = new PrintWriter(writer);

            for (int[] i: matrix) {
                printWriter.println();
                for (int j: i) {
                    printWriter.printf("%3s%1s", j, "");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileReader fileReader = new FileReader(fullPath)) {
            int d;
            while ((d = fileReader.read()) != -1){
                System.out.print((char) d);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
