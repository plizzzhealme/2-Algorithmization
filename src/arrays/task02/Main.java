package arrays.task02;

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
        System.out.println("Enter Z");

        double z = in.nextDouble();
        int replacementCount = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (a[i] > z) {
                a[i] = z;
                replacementCount++;
            }
        }

        System.out.println(replacementCount + " numbers have been replaced by Z = " + z);
        System.out.println("Final array:");

        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("%.2f ", a[i]);
        }
    }
}
