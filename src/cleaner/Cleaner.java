package cleaner;

import java.util.Random;
import java.util.Scanner;

public class Cleaner {
    private static final int BOUND = 13;
    private static final String DOUBLE_OUTPUT_FORMAT = "%7.2f";
    private static final String INT_OUTPUT_FORMAT = "%02d ";

    /*
    GENERATORS
     */

    public static int[] generateNaturalNumbersArray(int length) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(BOUND);
        }

        return array;
    }

    public static int[] generateIntegersArray(int length) {
        int[] array = new int[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(BOUND * 2) - BOUND;
        }

        return array;
    }

    public static double[] generateRealNumbersArray(int length) {
        double[] array = new double[length];
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            array[i] = random.nextDouble() * BOUND * 2 - BOUND;
        }

        return array;
    }

    public static int[][] generateMatrix(int height, int width) {
        int[][] matrix = new int[height][];

        for (int i = 0; i < height; i++) {
            matrix[i] = generateIntegersArray(width);
        }

        return matrix;
    }

    public static int[][] generateSquareMatrix(int size) {
        return generateMatrix(size, size);
    }

    /*
    PRINTS
     */

    public static void print(int[] array) {
        for (int value : array) {
            System.out.printf(INT_OUTPUT_FORMAT, value);
        }

        System.out.println();
    }

    public static void print(double[] array) {
        for (double value : array) {
            System.out.printf(DOUBLE_OUTPUT_FORMAT, value);
        }

        System.out.println();
    }

    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(int[][] matrix) {
        for (int[] ints : matrix) {
            print(ints);
        }
    }

    public static void print(double[][] matrix) {
        for (double[] doubles : matrix) {
            print(doubles);
        }
    }

    /*
    SCANNERS
     */

    public static int getIntFromUser() {
        return new Scanner(System.in).nextInt();
    }

    public static double getDoubleFromUser() {
        return new Scanner(System.in).nextDouble();
    }
}
