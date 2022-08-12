package com.sparta.ge.sorters;

import com.sparta.ge.logging.CustomFormatter;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuickSort implements Sorter{
    private static final Logger logger = Logger.getLogger("my logger");
    private static final ConsoleHandler consoleHandler = new ConsoleHandler();

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low - 1;

        for(int j=low; j<=high-1; j++){
            if(array[j] < pivot){
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i+1, high);
        return i+1;
    }

    public int[] quickSortMethod(int[] randomArrayToSort, int low, int high){
        if(low < high){
            int pi = partition(randomArrayToSort, low, high);
            quickSortMethod(randomArrayToSort, low, pi-1);
            randomArrayToSort = quickSortMethod(randomArrayToSort, pi+1, high);
        }
        return randomArrayToSort;
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        consoleHandler.setFormatter(new CustomFormatter());
        logger.log(Level.INFO, "Method sortArray has started");
        logger.log(Level.INFO, "Method calls the quick sort method");
        arrayToSort = quickSortMethod(arrayToSort, 0, arrayToSort.length-1);
        logger.log(Level.INFO, "Method ends");
        return arrayToSort;
    }
}
