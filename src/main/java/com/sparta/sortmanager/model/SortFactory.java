package com.sparta.sortmanager.model;

import java.util.Locale;

public class SortFactory {

    public Sorter getSorter(SortManager.SortTypes sortType) {
        if (sortType == null) {
            return null;
        }
        if (sortType.equals(SortManager.SortTypes.BUBBLE)) {
            return new BubbleSort();
        } else if (sortType.equals(SortManager.SortTypes.MERGE)) {
            return new MergeSort();
        }
        return null;
    }
}
