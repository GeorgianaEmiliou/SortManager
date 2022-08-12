package com.sparta.ge.sorters;

import com.sparta.ge.logging.CustomFormatter;

import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSort implements Sorter {

    private static final Logger logger = Logger.getLogger("my logger");
    private static final ConsoleHandler consoleHandler = new ConsoleHandler();

    @Override
    public int[] sortArray(int[] arrayToSort) {
        consoleHandler.setFormatter(new CustomFormatter());
        logger.log(Level.INFO, "Method sortArray has started");
        int length = arrayToSort.length;
        int temp;
        logger.info("The loop started");
        for(int i=0; i<length-1; i++){
            logger.log(Level.FINE, "For loop for iteration started, i is " + i);
            for(int j=0; j<length-i-1; j++){
                logger.log(Level.FINE, "For loop for comparison started, j is " + j);
                if(arrayToSort[j] > arrayToSort[j+1]){
                    temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = temp;
                }
            }
            logger.log(Level.FINE, "For loops has stopped");
        }
        logger.log(Level.INFO, "Method ends");
        return arrayToSort;
    }
}
