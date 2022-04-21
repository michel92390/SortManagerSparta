package com.sparta.sortmanager.sorters.test;

import com.sparta.sortmanager.sorters.MergeSort;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeSortTest {
    private MergeSort mergeSort;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up the merge sort object");
        mergeSort = new MergeSort();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tidying up");
        mergeSort = null;
    }

    @Test
    void sortArray() {
        MergeSort mergeSort = new MergeSort();
        int[] numbers = {9,8,7,6,5,4,3,2,1};
        int[] sortedNumbers = {1,2,3,4,5,6,7,8,9};
        Assertions.assertArrayEquals(sortedNumbers, mergeSort.sortArray(numbers));
    }
}