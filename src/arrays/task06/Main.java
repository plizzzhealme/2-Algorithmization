package arrays.task06;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter array size");

        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        double[] a = new double[arrayLength];
        int bound = 42;
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            a[i] = random.nextDouble() * bound * 2 - bound;
        }

        System.out.println("Initial array:");

        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("%.2f ", a[i]);
        }

        System.out.println();

        /*
        Sieve of Eratosthenes algorithm
         */
        int firstPrime = 2;
        boolean[] primeTags = new boolean[arrayLength];

        for (int i = firstPrime; i < arrayLength; i++) {
            primeTags[i] = true;
        }

        for (int i = firstPrime; i * i < arrayLength; i++) {
            if (primeTags[i]) {
                for (int j = i * i; j < arrayLength; j += i) {
                    primeTags[j] = false;
                }
            }
        }

        double sum = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (primeTags[i]) {
                sum += a[i];
            }
        }

        System.out.printf("Prime indexes sum = %.2f", sum);

    }
}
