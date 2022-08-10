package com.sparta.ge.start;

import com.sparta.ge.exceptions.SorterLoaderException;
import com.sparta.ge.sorters.*;

public class SortFactory {

    public Sorter getSorter(int input) throws SorterLoaderException{
        if(input == 1){
            return new BinarySort();
        }
        else if(input == 2){
            return new BubbleSort();
        }
        else if(input == 3){
            return new InsertionSort();
        }
        else if(input == 4){
            return new MergeSort();
        }
        else if(input == 5){
            return new QuickSort();
        }
        else{
            throw new SorterLoaderException("Invalid input: " + input);
        }
    }
}
