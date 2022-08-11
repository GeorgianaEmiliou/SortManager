package com.sparta.ge.start;

import com.sparta.ge.exceptions.SorterLoaderException;

public class App {
    public static void main(String[] args) throws SorterLoaderException {

        SortLoader sortLoader = new SortLoader();
        sortLoader.start();
    }
}
