package com.sparta.sortmanager.sorters.test;

import com.sparta.sortmanager.sorters.BubbleSort;
import org.junit.jupiter.api.*;

class BubbleSortTest {
    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        System.out.println("Setting up the bubble sort object");
        bubbleSort = new BubbleSort();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tidying up");
        bubbleSort = null;
    }

    @Test
    @DisplayName("Test the bubble sort algorithm")
    void sortArray() {
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = {9,8,7,6,5,4,3,2,1};
        int[] sortedNumbers = {1,2,3,4,5,6,7,8,9};
        Assertions.assertArrayEquals(sortedNumbers, bubbleSort.sortArray(numbers));
    }
}