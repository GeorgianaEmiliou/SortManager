package com.sparta.ge.sorters;

public class QuickSort implements Sorter{

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
        arrayToSort = quickSortMethod(arrayToSort, 0, arrayToSort.length-1);
        return arrayToSort;
    }
}
