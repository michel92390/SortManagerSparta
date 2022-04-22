package com.sparta.sortmanager.content;

import java.util.Random;
import java.util.Scanner;

import static com.sparta.sortmanager.display.UserChoice.logger;

public class RandomArray {

    public static int[] arr() {

        boolean lenArray = true;

        while(lenArray) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Length of the array between 2 and 20: ");
            int lengthArray = scan.nextInt();
            Random rand = new Random();
                if(lengthArray == 0){
                    System.out.println("The array could not be empty");
                    logger.error("The array length("+lengthArray+") could not be empty");
                } else if (lengthArray == 1) {
                    System.out.println("The array should have more than 1 item.");
                    logger.error("The array length should be longer than 1.");
                } else if (lengthArray > 20) {
                    System.out.println("The array should not have more than 20 items");
                    logger.error("The array should not have more than 20 items");
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
