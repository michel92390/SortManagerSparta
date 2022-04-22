package com.sparta.sortmanager.content;

import com.sparta.sortmanager.binaryTree.BinaryTreeSort;
import com.sparta.sortmanager.sorters.MergeSort;

public class GetTimes {
    public static double[] getAllTimes(int[] arrayToSort) {
        double[] times = new double[2];
        int[] arrayToSort2 = arrayToSort.clone();
        int[] arrayToSort3 = arrayToSort.clone();
        times[0] = getBubbleSortTime(arrayToSort);
        times[1] = getMergeSortTime(arrayToSort2);
        times[2] = getTreeSortTime(arrayToSort3);
        return times;
    }

    public static double getBubbleSortTime(int[] arrayToSort) {

        long startTime = System.nanoTime();
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            for (int j = 0; j < arrayToSort.length - i - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = temp;
                }
            }
        }

        long endTime = System.nanoTime();
        return (double) (endTime - startTime) / 1000000;
    }

    public static double getMergeSortTime(int[] arrayToSort) {
        MergeSort ms = new MergeSort();
        long startTime = System.nanoTime();

        ms.mergeSort(arrayToSort, 0, arrayToSort.length - 1);

        long endTime = System.nanoTime();
        return (double) (endTime - startTime) / 1000000;
    }

    public static double getTreeSortTime(int[] arrayToSort) {
        BinaryTreeSort bti = new BinaryTreeSort();
        bti.addElements(arrayToSort);

        long startTime = System.nanoTime();

        int[] sortedTree = bti.getSortedTreeAsc();

        long endTime = System.nanoTime();
        return (double) (endTime - startTime) / 1000000;
    }
}
