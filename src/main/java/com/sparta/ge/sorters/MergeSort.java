package com.sparta.ge.sorters;

public class MergeSort implements Sorter {

    public void merge(int[] array, int left, int middle, int right){
        int num1 = middle - left + 1;
        int num2 = right - middle;

        int[] leftArray = new int[num1];
        int[] rightArray = new int[num2];

        for(int i=0; i<num1; i++){
            leftArray[i] = array[left+i];
        }
        for(int j=0; j<num2; j++){
            rightArray[j] = array[middle+1+j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i<num1 && j<num2){
            if(leftArray[i] <= rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }
            else{
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i<num1){
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while(j<num2){
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void mergeSortMethod(int[] randomArrayToSort, int left, int right){
        if(left < right){
            int middle = (left + right)/2;
            mergeSortMethod(randomArrayToSort, left, middle);
            mergeSortMethod(randomArrayToSort, middle+1, right);
            merge(randomArrayToSort, left, middle, right);
        }
    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        mergeSortMethod(arrayToSort, 0, arrayToSort.length - 1);
        return arrayToSort;
    }
}
