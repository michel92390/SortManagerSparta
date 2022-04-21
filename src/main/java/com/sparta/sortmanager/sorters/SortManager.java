package com.sparta.sortmanager.sorters;

import com.sparta.sortmanager.display.Printer;
import com.sparta.sortmanager.display.UserChoice;

public class SortManager {

    public static void start() {
        UserChoice.chooseInput();
    }

    public static void sort(int[] arr, SortTypes sortTypes) {
        SortFactory sortFactory = new SortFactory();
        Sorter sorter = sortFactory.getSorter(sortTypes);
        Printer.printArray(arr, false);
        Printer.printArray(sorter.sortArray(arr), true);
    }

    public enum SortTypes {
        BUBBLE, MERGE, BINARYTREE
    }
}
