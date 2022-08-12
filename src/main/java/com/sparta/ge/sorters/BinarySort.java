package com.sparta.ge.sorters;

import com.sparta.ge.sorters.Sorter;
import com.sparta.ge.sorters.binaryTree.BinaryTree;

import java.util.Arrays;

public class BinarySort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinaryTree binaryTree = new BinaryTree(arrayToSort[0]);
        for(int i=1; i<arrayToSort.length; i++){
            binaryTree.addElement(arrayToSort[i]);
        }
        int[] sortedArray = binaryTree.getSortedTreeAsc();
        return sortedArray;
    }
}
