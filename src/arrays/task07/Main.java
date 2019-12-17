package arrays.task07;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter half of an array size");

        Scanner in = new Scanner(System.in);
        int halfLength = in.nextInt();
        int arrayLength = halfLength * 2;
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

        double maxPairSum = a[0] + a[arrayLength - 1];

        for (int i = 1; i < halfLength; i++) {
            double sum = a[i] + a[arrayLength - 1 - i];
            maxPairSum = Math.max(maxPairSum, sum);
        }

        System.out.printf("Max pair sum = %.2f", maxPairSum);
    }
}
