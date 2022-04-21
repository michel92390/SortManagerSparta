package com.sparta.sortmanager.model;

import com.sparta.sortmanager.view.Printer;
import com.sparta.sortmanager.view.UserChoice;

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
