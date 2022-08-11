package com.sparta.ge.sorters;

import com.sparta.ge.sorters.Sorter;
import com.sparta.ge.sorters.binaryTree.BinaryTree;

import java.util.Arrays;

public class BinarySort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTree binaryTree = new BinaryTree(-1);
        for(int i=0; i<arrayToSort.length; i++){
            binaryTree.addElement(arrayToSort[i]);
        }
        int[] sorted = binaryTree.getSortedTreeAsc();
        int[] sortedArray = Arrays.copyOfRange(sorted, 1, sorted.length);
        return sortedArray;
    }
}
