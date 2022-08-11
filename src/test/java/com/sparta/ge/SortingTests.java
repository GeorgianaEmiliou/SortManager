package com.sparta.ge;

import com.sparta.ge.sorters.InsertionSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SortingTests {
    InsertionSort insertionSort = new InsertionSort();

    @Test
    @DisplayName("Sort an array using insertion sort")
    public void sortingUsingInsertionSort(){
        int[] array = {3, 1, 9, 4, 2, 7};
        int[] sortedArray = {1, 2, 3, 4, 7, 9};
        int[] answer = insertionSort.sortArray(array);
        Assertions.assertArrayEquals(sortedArray, answer);

    }
}
