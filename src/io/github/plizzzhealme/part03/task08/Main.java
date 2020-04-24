package io.github.plizzzhealme.part03.task08;

import static io.github.plizzzhealme.interaction.Interaction.buildPositiveIntsArray;
import static io.github.plizzzhealme.interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        int length;
        int[] numerators;
        int[] denominators;

        System.out.println("Enter number of fractions");
        length = getPositiveInt();
        numerators = buildPositiveIntsArray(length);
        denominators = buildPositiveIntsArray(length);
        System.out.println("Initial:");
        printFractions(numerators, denominators);
        toCommonDenominator(numerators, denominators);
        System.out.println("With common denominator:");
        printFractions(numerators, denominators);
        sort(numerators);
        System.out.println("Sorted:");
        printFractions(numerators, denominators);
    }

    private static void toCommonDenominator(int[] numerators, int[] denominators) {
        int length = numerators.length;
        int commonDenominator = calcMultipleLcm(denominators);

        for (int i = 0; i < length; i++) {
            numerators[i] = numerators[i] * (commonDenominator / denominators[i]);
            denominators[i] = commonDenominator;
        }
    }

    private static void sort(int[] arr) {
        int length = arr.length;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    private static void printFractions(int[] numerators, int[] denominators) {
        for (int numerator : numerators) {
            System.out.printf("%6d", numerator);
        }
        System.out.println();

        for (int denominator : denominators) {
            System.out.printf("%6d", denominator);
        }
        System.out.println();
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
}