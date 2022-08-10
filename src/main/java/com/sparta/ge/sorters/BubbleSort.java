package com.sparta.ge.sorters;

public class BubbleSort implements Sorter {

    public int[] bubbleSortMethod(int[] randomArrayToSort){
        int length = randomArrayToSort.length;
        int temp;
        for(int i=0; i<length-1; i++){
            for(int j=0; j<length-i-1; j++){
                if(randomArrayToSort[j] > randomArrayToSort[j+1]){
                    temp = randomArrayToSort[j];
                    randomArrayToSort[j] = randomArrayToSort[j+1];
                    randomArrayToSort[j+1] = temp;
                }
            }
        }
        return randomArrayToSort;
    }
}
