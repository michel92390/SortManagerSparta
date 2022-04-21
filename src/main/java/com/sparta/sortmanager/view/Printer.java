package com.sparta.sortmanager.view;

import java.util.Arrays;

public class Printer {

    public static void printArray(int[] arrayToPrint, boolean sorted) {
        if (sorted) {
            System.out.println("Sorted Array: ");
        } else {
            System.out.println("Original Array: ");
        }
        System.out.println(Arrays.toString(arrayToPrint));
    }

    public static void printArray(int[] arrayToPrint) {
        System.out.println(Arrays.toString(arrayToPrint));
    }

    public static void printArray(double[] arrayToPrint) {
        System.out.println(Arrays.toString(arrayToPrint));
    }

    public static void printTimeTaken(double timeTaken, String sorter) {
        System.out.println("-----------------------------------------------------");
        System.out.println(sorter + " Sort took: " +
                timeTaken / 1000000 + "ms to be sorted");
        System.out.println("-----------------------------------------------------");
    }
}
