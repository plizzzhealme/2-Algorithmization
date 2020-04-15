package part03.task08;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number of fractions");
        int length = getInt();
        int[] nominators = buildPositiveIntsArray(length);
        int[] denominators = buildPositiveIntsArray(length);

        print(nominators);
        print(denominators);
        System.out.println(calcMultipleLcm(denominators));

        int maxDenominator = findMax(denominators);

        int lcm = maxDenominator;
        boolean isLcmFound = false;

        while (!isLcmFound) {
            isLcmFound = true;

            for (int i = 0; i < length; i++) {
                if (lcm % denominators[i] != 0) {
                    isLcmFound = false;
                    lcm += maxDenominator;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            nominators[i] = lcm / denominators[i] * nominators[i];
            denominators[i] = lcm;
        }

        System.out.println("With common denominator:");

        for (int nominator : nominators) {
            System.out.printf("%7d", nominator);
        }

        System.out.println();

        for (int denominator : denominators) {
            System.out.printf("%7d", denominator);
        }

        System.out.println();

        boolean sorted = false;

        while (!sorted) {
            sorted = true;

            for (int i = 0; i < length - 1; i++) {
                if (nominators[i] > nominators[i + 1]) {
                    int temp = nominators[i];
                    nominators[i] = nominators[i + 1];
                    nominators[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.println("Sorted:");

        for (int i = 0; i < length; i++) {
            System.out.printf("%15d", nominators[i]);
        }

        System.out.println();

        for (int i = 0; i < length; i++) {
            System.out.printf("%15d", lcm);
        }
    }

    private static int calcMultipleLcm(int[] arr) {
        int lcm = 1;

        for (int value : arr) {
            lcm = calcLcm(value, lcm);
        }
        return lcm;
    }

    private static int calcLcm(int a, int b) {
        return a * b / calcGcd(a, b);
    }

    private static int calcGcd(int a, int b) {
        return b == 0 ? a : calcGcd(b, a % b);
    }

    private static int findMax(int[] arr) {
        int max = arr[0];

        for (int denominator : arr) {
            max = Math.max(denominator, max);
        }
        return max;
    }
}