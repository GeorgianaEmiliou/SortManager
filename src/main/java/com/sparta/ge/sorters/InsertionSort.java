package com.sparta.ge.sorters;

public class InsertionSort implements Sorter{

    public int[] insertionSortMethod(int[] randomArrayToSort){
        int length = randomArrayToSort.length;
        for(int i=0; i<length; i++) {
            int key = randomArrayToSort[i];
            int j = i - 1;

            while(j >= 0 && randomArrayToSort[j] > key){
                randomArrayToSort[j+1] = randomArrayToSort[j];
                j--;
            }
            randomArrayToSort[j+1] = key;
        }
        return randomArrayToSort;
    }
}
