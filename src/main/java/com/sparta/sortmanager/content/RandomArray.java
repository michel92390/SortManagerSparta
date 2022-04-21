package com.sparta.sortmanager.content;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {

//    public static int[] lengthArray(int arrayLength) {
//        return lengthArray(arrayLength);
//    }

    public static int[] arr() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Length of the array: ");
        int lengthArray = scan.nextInt();
        Random rand = new Random();
        int[] arr = new int[lengthArray];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(-100, 100);
        }
        return arr;
    }

}
