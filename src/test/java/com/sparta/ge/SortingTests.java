package com.sparta.ge;

import com.sparta.ge.exceptions.SorterLoaderException;
import com.sparta.ge.sorters.*;
import com.sparta.ge.start.SortFactory;
import org.junit.jupiter.api.*;

import java.util.Random;

public class SortingTests {
    private static Sorter sorter;
    private int[] unsortedArray;

    @BeforeAll
    public static void setClass() throws SorterLoaderException{
        sorter = SortFactory.getSorter(3);
        System.out.println("Testing using " + sorter);
    }

    @BeforeEach
    public void setup(){
        Random random = new Random();
        unsortedArray = new int[10];
        for(int i=0; i<unsortedArray.length; i++){
            unsortedArray[i] = random.nextInt(100);
        }
    }

    @Test
    @DisplayName("Test if the array is sorted")
    public void testIsSorted(){
        int[] sorted = sorter.sortArray(unsortedArray);
        for(int i=0; i<sorted.length-1; i++){
            Assertions.assertTrue(sorted[i] <= sorted[i+1]);
        }
    }

    @Test
    @DisplayName("Test odd sized array")
    public void testOddSize(){
        int[] unsorted = {4, 7, 2, 1, 8};
        int[] sorted = sorter.sortArray(unsorted);
        Assertions.assertEquals(unsorted.length, sorted.length);
        Assertions.assertEquals(1, sorted.length%2);
        for(int i=0; i<sorted.length-1; i++) {
            Assertions.assertTrue(sorted[i] <= sorted[i + 1]);
        }
    }

    @Test
    @DisplayName("Test even sized array")
    public void testEvenSize(){
        int[] unsorted = {4, 8, 2, 1, 7, 16, 6, 9};
        int[] sorted = sorter.sortArray(unsorted);
        Assertions.assertEquals(unsorted.length, sorted.length);
        Assertions.assertEquals(0, sorted.length%2);
        for(int i=0; i<sorted.length-1; i++) {
            Assertions.assertTrue(sorted[i] <= sorted[i + 1]);
        }
    }

    @Test
    @DisplayName("Test array with duplicates")
    public void testArrayWithDuplicates(){
        int[] unsorted = {4, 6, 4, 7, 8, 1, 6};
        int[] sorted = sorter.sortArray(unsorted);
        Assertions.assertEquals(unsorted.length, sorted.length);
        for(int i=0; i<sorted.length-1; i++) {
            Assertions.assertTrue(sorted[i] <= sorted[i + 1]);
        }
    }

    @Test
    @DisplayName("Test array with one element")
    public void testArrayWithOneElement(){
        int[] unsorted = {4};
        int[] sorted = sorter.sortArray(unsorted);
        Assertions.assertEquals(unsorted.length, sorted.length);
        for(int i=0; i<sorted.length-1; i++) {
            Assertions.assertTrue(sorted[i] <= sorted[i + 1]);
        }
    }
}
