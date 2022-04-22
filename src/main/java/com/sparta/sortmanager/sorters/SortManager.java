package com.sparta.sortmanager.sorters;

import com.sparta.sortmanager.display.Printer;
import com.sparta.sortmanager.display.UserChoice;

public class SortManager {

    public static void start() {
        // user input here is the store of random array
        UserChoice.chooseInput();
    }

    // int[] arr is the random array chosen by the user
    // SortMethod is the 3 sort method available
    public static void sort(int[] arr, SortMethod sortMethod) {
        // 1st print the array not sorted
        Printer.printArray(arr, false);

        // then create new instance of SortFactory class called sortFactory where the 3 sort classes are returned
        SortFactory sortFactory = new SortFactory();
        // sorter returns the sort class chosen.
        Sorter sorter = sortFactory.getSorter(sortMethod);
        // then use sorter and the class method
        Printer.printArray(sorter.sortArray(arr), true);
    }

    public enum SortMethod {
        BUBBLE, MERGE, BINARYTREE
    }
}
