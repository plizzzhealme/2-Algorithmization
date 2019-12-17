package arrays.task01;

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
            array[i] = random.nextInt(bound);
        }

        System.out.println("Initial array:");

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Enter K");

        int k = in.nextInt();
        int sum = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }

        System.out.println("Sum of multiples of K:");
        System.out.println(sum);
    }
}