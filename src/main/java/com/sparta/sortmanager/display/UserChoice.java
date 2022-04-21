package com.sparta.sortmanager.display;

import com.sparta.sortmanager.content.RandomArray;
import com.sparta.sortmanager.exceptions.NotSorterException;
import com.sparta.sortmanager.sorters.SortManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserChoice {
    public static Logger logger = LogManager.getLogger(UserChoice.class);

    public static void chooseInput() {
        try {
            int[] randomNumbers = RandomArray.arr();
            UserChoice.chooseSorter(randomNumbers);
        } catch (InputMismatchException | NotSorterException e) {
            logger.error("wrongInput");
            System.out.println("wrongInput");
        }

    }

    public static SortManager.SortTypes chooseSorter(int[] numbers) throws NotSorterException {
        System.out.print("Enter 1 for bubble sort, 2 for merge sort or 3 for binary tree sort: ");
        Scanner sc = new Scanner(System.in);
        try {
            switch (sc.nextInt()) {
                case 1:
                    SortManager.sort(numbers, SortManager.SortTypes.BUBBLE);
                    return SortManager.SortTypes.BUBBLE;
                case 2:
                    SortManager.sort(numbers, SortManager.SortTypes.MERGE);
                    return SortManager.SortTypes.MERGE;
                case 3:
                    SortManager.sort(numbers, SortManager.SortTypes.BINARYTREE);
                    return SortManager.SortTypes.BINARYTREE;
                default:
                    throw new NotSorterException("wrongInput");
            }
        } catch (InputMismatchException e) {
            logger.error("wrongInput");
            System.out.println("wrongInput");
        }
        return null;
    }
}
