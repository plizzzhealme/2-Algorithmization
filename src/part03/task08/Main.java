package part03.task08;

import static cleaner.Cleaner.*;

public class Main {
    public static void main(String[] args) {
        print("Enter number of fractions");
        int length = getIntFromUser();
        int[] p = generateNaturalNumbersArray(length); //nominators
        int[] q = generateNaturalNumbersArray(length); //denominators

        print(p);
        print(q);

        int maxDenominator = q[0];

        for (int i = 0; i < length; i++) {
            maxDenominator = Math.max(q[i], maxDenominator);
        }

        int lcm = maxDenominator;
        boolean isLcmFound = false;

        while (!isLcmFound) {
            isLcmFound = true;

            for (int i = 0; i < length; i++) {
                if (lcm % q[i] != 0) {
                    isLcmFound = false;
                    lcm += maxDenominator;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            p[i] = lcm / q[i] * p[i];
        }

        print("With common denominator:");

        for (int i = 0; i < length; i++) {
            System.out.printf("%7d", p[i]);
        }

        System.out.println();

        for (int i = 0; i < length; i++) {
            System.out.printf("%7d", lcm);
        }

        System.out.println();

        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < length - 1; i++) {
                if (p[i] > p[i + 1]) {
                    int temp = p[i];
                    p[i] = p[i + 1];
                    p[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        print("Sorted:");

        for (int i = 0; i < length; i++) {
            System.out.printf("%7d", p[i]);
        }

        System.out.println();

        for (int i = 0; i < length; i++) {
            System.out.printf("%7d", lcm);
        }
    }
}