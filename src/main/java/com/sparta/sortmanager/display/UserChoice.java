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
            // inputUser stores the random array.
            int[] inputUser = RandomArray.arr();
            // then send to chooseSorter method with inputUser as parameter.
            UserChoice.chooseSorter(inputUser);
        } catch (InputMismatchException | NotSorterException e) {
            logger.error("wrongInput");
            System.out.println("wrongInput");
        }

    }

    // int[] rand == inputUser(random array stored)
    // chooseSorter returns "SortManager.SortMethod" which return enum with BUBBLE,MERGE and BINARY.
    public static SortManager.SortMethod chooseSorter(int[] rand) throws NotSorterException {
        System.out.print("Choose the sort method: \n Enter 1 for bubble sort." +
                "\n Enter 2 for merge sort. \n Enter 3 for binary tree sort. \nMethod chosen: ");
        Scanner sc = new Scanner(System.in);
        try {
            switch (sc.nextInt()) {
                case 1:
                    SortManager.sort(rand, SortManager.SortMethod.BUBBLE);
                    return SortManager.SortMethod.BUBBLE;
                case 2:
                    SortManager.sort(rand, SortManager.SortMethod.MERGE);
                    return SortManager.SortMethod.MERGE;
                case 3:
                    SortManager.sort(rand, SortManager.SortMethod.BINARYTREE);
                    return SortManager.SortMethod.BINARYTREE;
                default:
                    throw new NotSorterException("wrong sort input");
            }
        } catch (InputMismatchException e) {
            logger.error("wrong sort input");
            System.out.println("wrong sort input");
        }
        return null;
    }
}
