package com.sparta.ge;

import com.sparta.ge.methods.BubbleSort;
import com.sparta.ge.methods.InsertionSort;
import com.sparta.ge.methods.MergeSort;
import com.sparta.ge.methods.QuickSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args ) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int sortedMethodNum;

        do {
            System.out.println("Sorter methods: ");
            System.out.println("1. Binary Sorter");
            System.out.println("2. Bubble Sorter");
            System.out.println("3. Insertion Sorter");
            System.out.println("4. Merge Sorter");
            System.out.println("5. Quick Sorter");
            System.out.print("Please enter the number of the sorter method you wish to use: ");
            sortedMethodNum = scanner1.nextInt();
        } while (sortedMethodNum<1 || sortedMethodNum>5);



        int arraySize;
        do{
        System.out.print("Please enter the size of array you wish to generate: ");
        arraySize = scanner2.nextInt();
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
        else if(sortedMethodNum == 5){
            sortedMethod = "Quick Sort";
        }


        System.out.println("Sorting using the " + sortedMethod + " method");
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println("After sorting: ");
        QuickSort insertionSort = new QuickSort();
        int[] sortedArray = insertionSort.quickSortMethod(arrayToSort, 0, arraySize-1);

        System.out.println(Arrays.toString(sortedArray));
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
