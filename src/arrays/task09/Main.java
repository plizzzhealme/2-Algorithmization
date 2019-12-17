package arrays.task09;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter array length");

        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        int[] array = new int[arrayLength];
        int bound = 5;
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(bound * 2) - bound;
        }

        System.out.println("Initial array:");

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int mostFrequentNumber = array[0];
        int maxFrequency = 1;
        int currentFrequency;

        for (int i = 0; i < arrayLength; i++) {
            currentFrequency = 0;

            for (int j = i; j < arrayLength; j++) {
                if (array[i] == array[j]) {
                    currentFrequency++;
                }
            }

            if (currentFrequency >= maxFrequency) {
                maxFrequency = currentFrequency;
                mostFrequentNumber = Math.min(mostFrequentNumber, array[i]);
            }
        }

        System.out.println("The minimum of the most frequently occurring numbers is " + mostFrequentNumber);
    }
}
