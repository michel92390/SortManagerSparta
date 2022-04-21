package com.sparta.sortmanager.sorters;

import java.util.InputMismatchException;

import static com.sparta.sortmanager.display.UserChoice.logger;

public class SortFactory {

    public Sorter getSorter(SortManager.SortTypes sortType) {
        try {
            if (sortType == null) {
                return null;
            }
            if (sortType.equals(SortManager.SortTypes.BUBBLE)) {
                return new BubbleSort();
            } else if (sortType.equals(SortManager.SortTypes.MERGE)) {
                return new MergeSort();
            }
        } catch (InputMismatchException e) {
            logger.error("Wrong Sort Algorithm");
            System.out.println("Wrong Sort Algorithm");
        }

        return null;
    }
}
