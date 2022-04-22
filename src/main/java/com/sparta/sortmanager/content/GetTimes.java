package com.sparta.sortmanager.content;

import com.sparta.sortmanager.binaryTree.BinaryTreeSort;
import com.sparta.sortmanager.sorters.BubbleSort;
import com.sparta.sortmanager.sorters.MergeSort;

public class GetTimes {

    public static double getBubbleSortTime(int[] arrayToSort) {
        BubbleSort bubbleSort = new BubbleSort();
        long startTime = System.nanoTime();

        bubbleSort.sortArray(arrayToSort);

        long endTime = System.nanoTime();
        return (double) (endTime - startTime) / 1000000;
    }

    public static double getMergeSortTime(int[] arrayToSort) {
        MergeSort mergeSort = new MergeSort();
        long startTime = System.nanoTime();

        mergeSort.mergeSort(arrayToSort, 0, arrayToSort.length - 1);

        long endTime = System.nanoTime();
        return (double) (endTime - startTime) / 1000000;
    }

    public static double getTreeSortTime(int[] arrayToSort) {
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort();
        binaryTreeSort.addElements(arrayToSort);
        long startTime = System.nanoTime();

        binaryTreeSort.getSortedTreeAsc();

        long endTime = System.nanoTime();
        return (double) (endTime - startTime) / 1000000;
    }
}
