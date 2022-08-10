package com.sparta.ge.display;

import com.sparta.ge.sorters.*;
import com.sparta.ge.start.SortLoader;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DisplayManager {

    public void printOptions(){
        System.out.println("Sorter methods: ");
        System.out.println("1. Binary Sorter");
        System.out.println("2. Bubble Sorter");
        System.out.println("3. Insertion Sorter");
        System.out.println("4. Merge Sorter");
        System.out.println("5. Quick Sorter");
        System.out.print("Please enter the number of the sorter method you wish to use: ");
    }


    public static void beforeSorting(int[] array){
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(array));
    }


    public static void afterSorting(int[] array){
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(array));
    }
}
