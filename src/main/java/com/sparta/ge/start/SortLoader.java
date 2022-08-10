package com.sparta.ge.start;

import com.sparta.ge.display.DisplayManager;

import java.util.Random;
import java.util.Scanner;

public class SortLoader {
    public static Scanner scanner = new Scanner(System.in);
    public static DisplayManager displayManager = new DisplayManager();

    public static void main() {
        int sortedMethodNum;
        do {
            displayManager.printOptions();
            System.out.print("Please enter the number of the sorter method you wish to use: ");
            sortedMethodNum = scanner.nextInt();
        } while (sortedMethodNum < 1 || sortedMethodNum > 5);
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




    /*public void runSorters(Sorter sorter, int[] array){
        double start = System.nanoTime();
        sorter.sortArray(array);
        double finish = System.nanoTime();
        double timeTaken = finish - start;
        System.out.println("Time taken: " + timeTaken / 1_000_000 + " in milliseconds");
    }*/
