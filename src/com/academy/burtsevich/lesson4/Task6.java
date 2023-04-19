package com.academy.burtsevich.lesson4;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int [] array = {0, 10, 8, 1, 6, 5, 7, 2, 3, 9, 4};
        System.out.print ("Исходный массив: ");
        System.out.println(Arrays.toString(array));
        int startIndex = 0, stopIndex = array.length - 1;
        quickSort(array, startIndex, stopIndex);
        System.out.print("Отсортированный массив: ");
        System.out.println(Arrays.toString(array));

    }

    public static void quickSort(int[] array, int startIndex, int stopIndex){
        if (startIndex >= stopIndex){
            return;
        }

        int middleIndex = startIndex + (stopIndex - startIndex)/2;
        int middleValue = array[middleIndex];
        int newStartIndex = startIndex;
        int newStopIndex = stopIndex;

        while (newStartIndex < newStopIndex){
            while (array[newStartIndex] < middleValue){
                newStartIndex ++;
            }
            while (array[newStopIndex] > middleValue){
                newStopIndex --;
            }
            if (newStartIndex <= newStopIndex){
                int tempValue = array[newStartIndex];
                array[newStartIndex] = array[newStopIndex];
                array[newStopIndex] = tempValue;
                newStartIndex ++;
                newStopIndex --;
            }
        }
        if (startIndex < newStopIndex){
            quickSort(array, startIndex, newStopIndex);
        }
        if (stopIndex > newStartIndex){
            quickSort(array, newStartIndex, stopIndex);
        }
    }
}

// Этот код был написан мной только после прочтения подробной статьи и просмотра
// нескольких видео с обзором QuickSort - называть его моим в этом случае будет нечестно.