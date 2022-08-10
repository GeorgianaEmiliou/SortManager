package com.sparta.ge.sorters;

public class BubbleSort implements Sorter {

    @Override
    public int[] sortArray(int[] arrayToSort) {
        int length = arrayToSort.length;
        int temp;
        for(int i=0; i<length-1; i++){
            for(int j=0; j<length-i-1; j++){
                if(arrayToSort[j] > arrayToSort[j+1]){
                    temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = temp;
                }
            }
        }
        return arrayToSort;
    }
}
