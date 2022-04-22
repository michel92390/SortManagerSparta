package com.sparta.sortmanager.sorters;

import com.sparta.sortmanager.binaryTree.BinaryTreeSort;
import java.util.InputMismatchException;
import static com.sparta.sortmanager.display.UserChoice.logger;

public class SortFactory {

    // factory which has as a parameter enum with BUBBLE,MERGE and BINARY
    public Sorter getSorter(SortManager.SortMethod sortType) {
        try {
            if (sortType.equals(SortManager.SortMethod.BUBBLE)) {
                return new BubbleSort();
            } else if (sortType.equals(SortManager.SortMethod.MERGE)) {
                return new MergeSort();
            } else if (sortType.equals(SortManager.SortMethod.BINARYTREE)) {
                return new BinaryTreeSort();
            }
        } catch (InputMismatchException e) {
            logger.error("Wrong Sort Algorithm");
            System.out.println("Wrong Sort Algorithm");
        }

        return null;
    }
}
