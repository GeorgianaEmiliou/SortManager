package com.sparta.ge;

import com.sparta.ge.sorters.*;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Random;

public class PerformanceTests {


    private int[] unsorted;
    private static int[] arrayToSort;

    Sorter sorter;

    @BeforeAll
    public static void classSetUp(){
        Random random = new Random();
        arrayToSort = new int[100];
        for(int i=0; i<arrayToSort.length; i++){
            arrayToSort[i] = random.nextInt(1000);
        }
    }

    @BeforeEach
    public void setUp(){
        unsorted = arrayToSort.clone();
    }

    public void print(int[] sortedArray, double timeTaken){
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("Time taken: " + timeTaken / 1_000_000 + " in nanoseconds");
    }


    @Test
    @DisplayName("Sort an array using insertion sort")
    public void sortingUsingInsertionSort(){
        System.out.println("Unsorted array: " + Arrays.toString(unsorted));
        sorter = new InsertionSort();
        double startTime = System.nanoTime();
        int[] sorted = sorter.sortArray(unsorted);
        double endTime = System.nanoTime();
        double timeTaken = endTime - startTime;
        print(sorted, timeTaken);
        int[] array = {3, 1, 9, 4, 2, 7};
        int[] sortedArray = {1, 2, 3, 4, 7, 9};
        int[] answer = sorter.sortArray(array);
        Assertions.assertArrayEquals(sortedArray, answer);
        for(int i=0; i<sortedArray.length-1; i++) {
            Assertions.assertTrue(sortedArray[i] <= sortedArray[i + 1]);
        }
    }

    @Test
    @DisplayName("Sort an array using bubble sort")
    public void sortingUsingBubbleSort(){
        System.out.println("Unsorted array: " + Arrays.toString(unsorted));
        sorter = new BubbleSort();
        double startTime = System.nanoTime();
        int[] sorted = sorter.sortArray(unsorted);
        double endTime = System.nanoTime();
        double timeTaken = endTime - startTime;
        print(sorted, timeTaken);
        int[] array = {300, 101, 954, 944, 221, 217};
        int[] sortedArray = {101, 217, 221, 300, 944, 954};
        int[] answer = sorter.sortArray(array);
        Assertions.assertArrayEquals(sortedArray, answer);
        for(int i=0; i<sortedArray.length-1; i++) {
            Assertions.assertTrue(sortedArray[i] <= sortedArray[i + 1]);
        }
    }

    @Test
    @DisplayName("Sort an array using binary sort")
    public void sortingUsingBinarySort(){
        System.out.println("Unsorted array: " + Arrays.toString(unsorted));
        sorter = new BinarySort();
        double startTime = System.nanoTime();
        int[] sorted = sorter.sortArray(unsorted);
        double endTime = System.nanoTime();
        double timeTaken = endTime - startTime;
        print(sorted, timeTaken);
        int[] array = {1, 1, 56, 436, 781, 49, 90, 93, 221, 12, 658, 438, 984};
        int[] sortedArray = {1, 1, 12, 49, 56, 90, 93, 221, 436, 438, 658, 781, 984};
        int[] answer = sorter.sortArray(array);
        Assertions.assertArrayEquals(sortedArray, answer);
        for(int i=0; i<sortedArray.length-1; i++) {
            Assertions.assertTrue(sortedArray[i] <= sortedArray[i + 1]);
        }
    }


    @Test
    @DisplayName("Sort an array using merge sort")
    public void sortingUsingMergeSort(){
        System.out.println("Unsorted array: " + Arrays.toString(unsorted));
        sorter = new MergeSort();
        double startTime = System.nanoTime();
        int[] sorted = sorter.sortArray(unsorted);
        double endTime = System.nanoTime();
        double timeTaken = endTime - startTime;
        print(sorted, timeTaken);
        int[] array = {23, 554, 981, 981, 1, 63, 87, 432};
        int[] sortedArray = {1, 23, 63, 87, 432, 554, 981, 981};
        int[] answer = sorter.sortArray(array);
        Assertions.assertArrayEquals(sortedArray, answer);
        for(int i=0; i<sortedArray.length-1; i++) {
            Assertions.assertTrue(sortedArray[i] <= sortedArray[i + 1]);
        }

    }

    @Test
    @DisplayName("Sort an array using quick sort")
    public void sortingUsingQuickSort(){
        System.out.println("Unsorted array: " + Arrays.toString(unsorted));
        sorter = new QuickSort();
        double startTime = System.nanoTime();
        int[] sorted = sorter.sortArray(unsorted);
        double endTime = System.nanoTime();
        double timeTaken = endTime - startTime;
        print(sorted, timeTaken);
        int[] array = {12, 47, 761, 980, 621};
        int[] sortedArray = {12, 47, 621, 761, 980};
        int[] answer = sorter.sortArray(array);
        Assertions.assertArrayEquals(sortedArray, answer);
        for(int i=0; i<sortedArray.length-1; i++) {
            Assertions.assertTrue(sortedArray[i] <= sortedArray[i + 1]);
        }
    }

    @Test
    @DisplayName("Sort an empty array using merge sort")
    public void sortingEmptyArrayUsingMergeSort(){
        sorter = new MergeSort();
        int[] array = {};
        int[] sortedArray = {};
        int[] answer = sorter.sortArray(array);
        Assertions.assertArrayEquals(sortedArray, answer);
    }

    @Test
    @DisplayName("Sort an empty array using quick sort")
    public void sortingEmptyArrayUsingQuickSort(){
        sorter = new QuickSort();
        int[] array = {};
        int[] sortedArray = {};
        int[] answer = sorter.sortArray(array);
        Assertions.assertArrayEquals(sortedArray, answer);
    }

    @Test
    @DisplayName("Sort an empty array using insertion sort")
    public void sortingEmptyArrayUsingInsertionSort(){
        sorter = new InsertionSort();
        int[] array = {};
        int[] sortedArray = {};
        int[] answer = sorter.sortArray(array);
        Assertions.assertArrayEquals(sortedArray, answer);
    }

    @Test
    @DisplayName("Sort an empty array using bubble sort")
    public void sortingEmptyArrayUsingBubbleSort(){
        sorter = new BinarySort();
        int[] array = {};
        int[] sortedArray = {};
        int[] answer = sorter.sortArray(array);
        Assertions.assertArrayEquals(sortedArray, answer);
    }

    @Test
    @DisplayName("Sort an empty array using binary sort")
    public void sortingEmptyArrayUsingBinarySort(){
        sorter = new BinarySort();
        int[] array = {};
        int[] sortedArray = {};
        int[] answer = sorter.sortArray(array);
        Assertions.assertArrayEquals(sortedArray, answer);
    }
}
