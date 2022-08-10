package com.sparta.ge.start;

import com.sparta.ge.exceptions.SorterLoaderException;
import com.sparta.ge.sorters.*;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args ) throws SorterLoaderException {
        Scanner scanner = new Scanner(System.in);

        int sortedMethodNum;

        do {
            System.out.println("Sorter methods: ");
            System.out.println("1. Binary Sorter");
            System.out.println("2. Bubble Sorter");
            System.out.println("3. Insertion Sorter");
            System.out.println("4. Merge Sorter");
            System.out.println("5. Quick Sorter");
            System.out.print("Please enter the number of the sorter method you wish to use: ");
            sortedMethodNum = scanner.nextInt();
        } while (sortedMethodNum<1 || sortedMethodNum>5);



        int arraySize;
        do{
        System.out.print("Please enter the size of array you wish to generate: ");
        arraySize = scanner.nextInt();
        } while (arraySize<=0);


        int[] arrayToSort = randomArray(arraySize);

        String sortedMethod = "";


        if(sortedMethodNum == 1){
            sortedMethod = "Binary Sort";
        }
        else if(sortedMethodNum == 2){
            sortedMethod = "Bubble Sort";
        }
        else if(sortedMethodNum == 3){
            sortedMethod = "Insertion Sort";
        }
        else if(sortedMethodNum == 4){
            sortedMethod = "Merge Sort";
        }
        else {
            sortedMethod = "Quick Sort";
        }


        SortFactory sortFactory = new SortFactory();
        System.out.println("Sorting using the " + sortedMethod + " method");
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arrayToSort));
        double start = System.nanoTime();
        int[] sortedArray = sortFactory.getSorter(sortedMethodNum).sortArray(arrayToSort);
        double finish = System.nanoTime();
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(sortedArray));
        double timeTaken = finish - start;
        System.out.println("Time taken: " + timeTaken / 1_000_000 + " in milliseconds");

    }

    public static int[] randomArray(int arraySize){
        int min = 1;
        int max = 1000;
        Random random = new Random();
        int[] numbers = new int[arraySize];
        for(int i=0; i<numbers.length; i++){
            numbers[i] = min + random.nextInt(max);
        }
        return numbers;
    }
}
