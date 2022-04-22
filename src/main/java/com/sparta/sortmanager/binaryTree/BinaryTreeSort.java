package com.sparta.sortmanager.binaryTree;

import com.sparta.sortmanager.display.Printer;
import com.sparta.sortmanager.exceptions.ChildNotFoundException;
import com.sparta.sortmanager.sorters.Sorter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BinaryTreeSort implements Sorter {
    public static final Logger logger = LogManager.getLogger(BinaryTreeSort.class);

    @Override
    public int[] sortArray(int[] arrayToSort) {
        addElements(arrayToSort);
        long startTime = System.nanoTime();
        int[] sortedTree = getSortedTreeAsc();

        long endTime = System.nanoTime();
        double timeTaken = endTime - startTime;
        Printer.printTimeTaken(timeTaken, "Binary Tree");
        return sortedTree;
    }

    static class Node {
        public Node left, right;
        public int value;

        public Node(int value) {
            this.value = value;
            left = right = null;
        }
    }

    Node root;
    int size;
    private int count;
    private int[] arr;

    public BinaryTreeSort(int value) {
        this.root = new Node(value);
    }
    public BinaryTreeSort() {
        this.root = null;
    }
    public int getRootElement() {
        return root.value;
    }
    public int getNumberOfElements() {
        return size;
    }

    public void addElement(int element) {
        root = addRecursive(root, element);
        size++;
    }

    public Node addRecursive(Node current, int element) {
        if (current == null) {
            current = new Node(element);
            return current;
        }

        if (element < current.value) {
            current.left = addRecursive(current.left, element);
        } else if (element > current.value) {
            current.right = addRecursive(current.right, element);
        }

        return current;
    }

    public void addElements(int[] elements) {
        for (int element : elements) {
            addElement(element);
        }
    }

    public boolean findElement(int value) {
        if (searchElement(root, value) != null) {
            return true;
        }
        return false;
    }

    private Node searchElement(Node root, int element) {
        if (root == null) {
            return null;
        } else if (element == root.value) {
            return root;
        } else if (element > root.value) {
            return searchElement(root.right, element);
        } else {
            return searchElement(root.left, element);
        }
    }

    public int getLeftChild(int element) throws ChildNotFoundException {
        if (!findElement(element)) {
            throw new ChildNotFoundException("no kids over here");
        } else {
            return searchElement(root, element).left.value;
        }
    }

    public int getRightChild(int element) throws ChildNotFoundException {
        if (!findElement(element)) {
            throw new ChildNotFoundException("no kids over here");
        } else {
            return searchElement(root, element).right.value;
        }
    }

    public int[] getSortedTreeAsc() {
        arr = new int[size];
        count = 0;
        ascRecursive(root);
        return arr;
    }

    private void ascRecursive(Node current) {
        if (current != null) {
            ascRecursive(current.left);
            arr[count++] = current.value;
            ascRecursive(current.right);
        }
    }

    public int[] getSortedTreeDesc() {
        arr = new int[size];
        count = 0;
        descRecursive(root);
        return null;
    }

    private void descRecursive(Node current) {
        if (current != null) {
            descRecursive(current.right);
            arr[count++] = current.value;
            descRecursive(current.left);
        }
    }
}
