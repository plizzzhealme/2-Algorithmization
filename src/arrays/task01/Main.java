package arrays.task01;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter array length");

        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        int[] a = new int[arrayLength];
        int bound = 42;
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            a[i] = random.nextInt(bound);
        }

        System.out.println("Initial array:");

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Enter K");

        int k = in.nextInt();
        int sum = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }

        System.out.println("Sum of multiples of K:");
        System.out.println(sum);
    }
}