package arrays.task09;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter array length");

        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        int[] a = new int[arrayLength];
        int bound = 10;
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            a[i] = random.nextInt(bound * 2) - bound;
        }

        System.out.println("Initial array:");

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        int mostFrequentNumber = a[0];
        int maxFrequency = 1;
        int currentFrequency;

        for (int i = 0; i < arrayLength; i++) {
            currentFrequency = 0;

            for (int j = i; j < arrayLength; j++) {
                if (a[i] == a[j]) {
                    currentFrequency++;
                }
            }

            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mostFrequentNumber = a[i];
            } else if (currentFrequency == maxFrequency) {
                mostFrequentNumber = Math.min(mostFrequentNumber, a[i]);
            }
        }

        System.out.println("The minimum of the most frequently occurring numbers is " + mostFrequentNumber);
    }
}
