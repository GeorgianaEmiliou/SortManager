package com.sparta.ge.sorters;

import com.sparta.ge.logging.CustomFormatter;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertionSort implements Sorter{
    private static final Logger logger = Logger.getLogger("my logger");
    private static final ConsoleHandler consoleHandler = new ConsoleHandler();

    @Override
    public int[] sortArray(int[] arrayToSort) {
        consoleHandler.setFormatter(new CustomFormatter());
        logger.log(Level.INFO, "Method sortArray has started");
        int length = arrayToSort.length;

        for(int i=0; i<length; i++) {
            logger.log(Level.FINE, "For loop for iteration started, i is " + i);
            int key = arrayToSort[i];
            int j = i - 1;

            logger.info("The while loop started");
            while(j >= 0 && arrayToSort[j] > key){
                logger.log(Level.FINE, "While loop for comparison started, j is " + j);
                arrayToSort[j+1] = arrayToSort[j];
                j--;
            }
            arrayToSort[j+1] = key;
            logger.log(Level.FINE, "Loops has stopped");
        }
        logger.log(Level.INFO, "Method ends");
        return arrayToSort;
    }
}
