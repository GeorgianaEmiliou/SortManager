package com.sparta.ge.sorters;

import com.sparta.ge.logging.CustomFormatter;
import com.sparta.ge.sorters.Sorter;
import com.sparta.ge.sorters.binaryTree.BinaryTree;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinarySort implements Sorter {
    private static final Logger logger = Logger.getLogger("my logger");
    private static final ConsoleHandler consoleHandler = new ConsoleHandler();
    @Override
    public int[] sortArray(int[] arrayToSort) {
        consoleHandler.setFormatter(new CustomFormatter());
        logger.log(Level.INFO, "Method sortArray has started");
        BinaryTree binaryTree = new BinaryTree(arrayToSort[0]);
        for(int i=1; i<arrayToSort.length; i++){
            binaryTree.addElement(arrayToSort[i]);
        }
        int[] sortedArray = binaryTree.getSortedTreeAsc();
        logger.log(Level.INFO, "Method ends");
        return sortedArray;
    }
}
