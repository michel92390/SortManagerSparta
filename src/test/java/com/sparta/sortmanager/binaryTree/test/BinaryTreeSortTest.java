package com.sparta.sortmanager.binaryTree.test;

import com.sparta.sortmanager.binaryTree.BinaryTreeSort;
import com.sparta.sortmanager.exceptions.ChildNotFoundException;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeSortTest {
    private BinaryTreeSort binaryTreeSort = new BinaryTreeSort();

    @BeforeEach
    void setUp() {
        System.out.println("Setting up the binary tree sort object");
        binaryTreeSort = new BinaryTreeSort();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Tidying up");
        binaryTreeSort = null;
    }

    @Test
    @DisplayName("Test the number of elements in the array")
    void getNumberOfElements() {
        binaryTreeSort = new BinaryTreeSort(5);
        Assertions.assertEquals(0, binaryTreeSort.getNumberOfElements());
    }

    @Test
    @DisplayName("Test binary to add a new element.")
    void addElement() {
        binaryTreeSort.addElement(5);
        Assertions.assertEquals(5, binaryTreeSort.getRootElement());
    }

    @Test
    @DisplayName("Test the number of elements in the array")
    void addElements() {
        binaryTreeSort.addElements(new int[] {5,3,7});
        Assertions.assertEquals(3, binaryTreeSort.getNumberOfElements());
    }

    @Test
    @DisplayName("Test if the left child is inserted properly")
    void getLeftChild() throws ChildNotFoundException {
        binaryTreeSort = new BinaryTreeSort(10);
        binaryTreeSort.addElement(8);
        binaryTreeSort.addElement(15);
        Assertions.assertEquals(8, binaryTreeSort.getLeftChild(10));
    }

    @Test
    @DisplayName("Test if the right child is inserted properly")
    void getRightChild() throws ChildNotFoundException {
        binaryTreeSort = new BinaryTreeSort(10);
        binaryTreeSort.addElement(8);
        binaryTreeSort.addElement(15);
        Assertions.assertEquals(15, binaryTreeSort.getRightChild(10));
    }

    @Test
    @DisplayName("Test binary tree in ascending numbers.")
    void getSortedTreeAsc() {
        binaryTreeSort.addElements(new int[] {5, 4, 7, 2, 11});
        Assertions.assertArrayEquals(new int[] {2, 4, 5, 7, 11}, binaryTreeSort.getSortedTreeAsc());
    }

    @Test
    @DisplayName("Test binary tree in descending numbers.")
    void getSortedTreeDesc(){
        binaryTreeSort.addElements(new int[]{19, 8, 27, 39, 36, 24});
        Assertions.assertArrayEquals(new int[]{8, 19, 24, 27, 36, 39}, binaryTreeSort.getSortedTreeAsc());
    }
}