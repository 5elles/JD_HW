package com.academy.burtsevich.lesson4;

public class Task7 {
    public static void main(String[] args) {
        double[] array = getFunctionResult(5.33, 9, 0.1, 30);   // шаг 0.1 сделал, т.к 0.01 слишком мало, а 1 - слишком много. Не уверен в правильности такого решения...
        double[] newArray = getNewArray(array, 3.5);

        System.out.println("_________________________________________");
        System.out.println("Выводим массив с заголовком и с индексами: ");
        printFormattedArray(array);
        System.out.println("_________________________________________");
        System.out.println("Выводим новый массив из значений больше 3,5: ");
        for (double element: newArray){
            String result = String.format("%.3f", element);
            System.out.printf("%-7s", result);
        }
        System.out.println();
        System.out.println("_________________________________________");
        System.out.println("Среднее геометрическое от значений нового массива: ");
        System.out.println(getGeometricMean(newArray));

    }

    static double[] getFunctionResult(double min, double max, double step, int arrayLength){
        double[] array = new double[arrayLength];
        double z;
        int index = 0;

        for (double x = min; x <= max; x += step) {
            z = Math.cbrt(Math.pow(x, 2) + 4.5);
            array[index] = z;
            if (index < array.length - 1) {
                index++;
            } else {
                break;
            }
        }
        return array;
    }

    static void printFormattedArray(double[] array){
        for (int i = 0; i < array.length; i++) {
            String result = String.format("%.3f", array[i]);
            System.out.print("A[" + i + "] = " + result + " ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }

    static double[] getNewArray(double[] array, double moreThan){
        int counter = 0;
        for (double element: array) {
            if (element > moreThan){
                counter ++;
            }
        }
        double[] newArray = new double[counter];

        int index = 0;
        for (double element: array){
            if (element > moreThan){
                newArray[index] = element;
                if (index < newArray.length){
                    index ++;
                }
            }
        }
        return newArray;
    }

    static double getGeometricMean(double[] array){
        double product = 1;
        for (double element: array){
            product *= element;
        }
        return Math.pow(product, (double) 1 /array.length);
    }
}
