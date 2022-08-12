package com.sparta.ge.display;

import java.util.Arrays;

public class DisplayManager {

    public static void printOptions(){
        System.out.println("Sorter methods: ");
        System.out.println("1. Binary Sorter");
        System.out.println("2. Bubble Sorter");
        System.out.println("3. Insertion Sorter");
        System.out.println("4. Merge Sorter");
        System.out.println("5. Quick Sorter");
        System.out.print("Please enter the number of the sorter method you wish to use: ");
    }

    public static void printSortingMethod(int sortedMethodNum){
        String sortedMethod="";
        if (sortedMethodNum == 1) {
            sortedMethod = "Binary Sort";
        } else if (sortedMethodNum == 2) {
            sortedMethod = "Bubble Sort";
        } else if (sortedMethodNum == 3) {
            sortedMethod = "Insertion Sort";
        } else if (sortedMethodNum == 4) {
            sortedMethod = "Merge Sort";
        } else {
            sortedMethod = "Quick Sort";
        }
        System.out.println("Sorting using the " + sortedMethod + " method");
    }

    public static void printArraySize(){
        System.out.print("Please enter the size of array you wish to generate: ");
    }

    public static void printArrayBeforeSorting(int[] array){
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(array));
    }

    public static void printArrayAfterSorting(int[] array){
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(array));
    }

    public static void printTimeTaken(double timeTaken){
        System.out.println("Time taken: " + timeTaken / 1_000_000 + " in nanoseconds");
    }
}
