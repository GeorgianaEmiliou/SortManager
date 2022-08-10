package com.sparta.ge.sorters;

public class InsertionSort implements Sorter{

    @Override
    public int[] sortArray(int[] arrayToSort) {
        int length = arrayToSort.length;
        for(int i=0; i<length; i++) {
            int key = arrayToSort[i];
            int j = i - 1;

            while(j >= 0 && arrayToSort[j] > key){
                arrayToSort[j+1] = arrayToSort[j];
                j--;
            }
            arrayToSort[j+1] = key;
        }
        return arrayToSort;
    }
}
