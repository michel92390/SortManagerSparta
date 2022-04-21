package com.sparta.sortmanager.sorters;

import com.sparta.sortmanager.display.Printer;

public class BubbleSort implements Sorter {


    @Override
    public int[] sortArray(int[] arrayToSort) {
        long startTime = System.nanoTime();
        int size = arrayToSort.length;
        for(int i = 0; i < size - 1; i++) {
            for(int j = 0; j < size - i - 1; j++) {
                if(arrayToSort[j] > arrayToSort[j + 1]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }
        long endTime = System.nanoTime();
        double timeTaken = endTime - startTime;
        if (arrayToSort.length != 0) {
            Printer.printTimeTaken(timeTaken, "Bubble");
        }
        return arrayToSort;
    }
}
