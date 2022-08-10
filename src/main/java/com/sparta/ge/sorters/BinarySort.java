package com.sparta.ge.sorters;

import com.sparta.ge.sorters.Sorter;

public class BinarySort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        return new int[0];
    }

    /*public int[] binarySort(int[] array){
        boolean swapped = true;
        int start = 0;
        int end = array.length;

        while(swapped == true){
            swapped = false;
            for(int i=start; i<end-1; i++) {
                if (array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
    }*/

}
