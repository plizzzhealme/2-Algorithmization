package arrays.task08;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter array length");

        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        int[] array = new int[arrayLength];
        int bound = 42;
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(bound * 2) - bound;
        }

        System.out.println("Initial array:");

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int min = array[0];

        for (int i = 1; i < arrayLength; i++) {
            min = Math.min(min, array[i]);
        }

        int minCount = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] == min) {
                minCount++;
            }
        }

        int finalArrayLength = arrayLength - minCount;
        int[] finalArray = new int[finalArrayLength];

        for (int i = 0, j = 0; i < arrayLength; i++) {
            if (array[i] != min) {
                finalArray[j] = array[i];
                j++;
            }
        }

        System.out.println("Final array without min elements:");

        for (int i = 0; i < finalArrayLength; i++) {
            System.out.print(finalArray[i] + " ");
        }
    }
}
