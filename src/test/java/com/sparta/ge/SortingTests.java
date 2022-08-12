package com.sparta.ge;

import com.sparta.ge.sorters.BubbleSort;
import com.sparta.ge.sorters.InsertionSort;
import com.sparta.ge.sorters.MergeSort;
import com.sparta.ge.sorters.QuickSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SortingTests {
    InsertionSort insertionSort = new InsertionSort();
    BubbleSort bubbleSort = new BubbleSort();
    MergeSort mergeSort = new MergeSort();
    QuickSort quickSort = new QuickSort();

    @Test
    @DisplayName("Sort an array using insertion sort")
    public void sortingUsingInsertionSort(){
        int[] array = {3, 1, 9, 4, 2, 7};
        int[] sortedArray = {1, 2, 3, 4, 7, 9};
        int[] answer = insertionSort.sortArray(array);
        Assertions.assertArrayEquals(sortedArray, answer);
    }

    @Test
    @DisplayName("Sort an array using bubble sort")
    public void sortingUsingBubbleSort(){
        int[] array = {300, 101, 954, 944, 221, 217};
        int[] sortedArray = {101, 217, 221, 300, 944, 954};
        int[] answer = bubbleSort.sortArray(array);
        Assertions.assertArrayEquals(sortedArray, answer);
    }
}
