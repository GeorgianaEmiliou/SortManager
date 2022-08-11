package com.sparta.ge.start;

import com.sparta.ge.display.DisplayManager;
import com.sparta.ge.exceptions.SorterLoaderException;

import java.util.Random;
import java.util.Scanner;

public class SortLoader {

    public void start() throws SorterLoaderException {

        Scanner scanner = new Scanner(System.in);

        int sortedMethodNum;

        do {
            DisplayManager.printOptions();
            sortedMethodNum = scanner.nextInt();
        } while (sortedMethodNum < 1 || sortedMethodNum > 5);


        int arraySize;
        do {
            DisplayManager.printArraySize();
            arraySize = scanner.nextInt();
        } while (arraySize <= 0);


        int[] arrayToSort = randomArray(arraySize);


        DisplayManager.printSortingMethod(sortedMethodNum);
        DisplayManager.printArrayBeforeSorting(arrayToSort);
        double start = System.nanoTime();
        int[] sortedArray = SortFactory.getSorter(sortedMethodNum).sortArray(arrayToSort);
        double finish = System.nanoTime();
        DisplayManager.printArrayAfterSorting(sortedArray);
        double timeTaken = finish - start;
        DisplayManager.printTimeTaken(timeTaken);

    }


    public static int[] randomArray(int arraySize) {
        int min = 1;
        int max = 1000;
        Random random = new Random();
        int[] numbers = new int[arraySize];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = min + random.nextInt(max);
        }
        return numbers;
    }
}


