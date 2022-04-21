package com.sparta.sortmanager.content;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {

    public static int[] arr() {

        boolean lenArray = true;

        while(lenArray) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Length of the array: ");
            int lengthArray = scan.nextInt();
            Random rand = new Random();

            if(lengthArray == 0){
                System.out.println("The array could not be empty");
            } else if (lengthArray == 1) {
                System.out.println("The array length should be more than 1");
            } else {
                int[] arr = new int[lengthArray];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = rand.nextInt(-100, 100);
                }
                lenArray = false;
                return arr;
            }
        }
        return null;
    }

}
