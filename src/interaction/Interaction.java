package interaction;

import java.util.Random;
import java.util.Scanner;

public class Interaction {
    private static final int BOUND = 13;
    private static final int DOUBLE_BOUND = BOUND * 2;
    private static final Scanner in = new Scanner(System.in);
    private static final Random r = new Random();

    private Interaction() {
    }

    public static int[] buildPositiveIntsArray(int length) {
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = r.nextInt(BOUND) + 1;
        }
        return arr;
    }

    public static int[] buildIntsArray(int length) {
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = r.nextInt(DOUBLE_BOUND) - BOUND;
        }
        return arr;
    }

    private static int[] buildNotNegativeIntsArray(int length) {
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = r.nextInt(BOUND);
        }
        return arr;
    }

    public static double[] buildDoublesArray(int length) {
        double[] arr = new double[length];

        for (int i = 0; i < length; i++) {
            arr[i] = r.nextDouble() * DOUBLE_BOUND - BOUND;
        }
        return arr;
    }

    public static int[][] buildIntsMatrix(int height, int width) {
        int[][] matrix = new int[height][];

        for (int row = 0; row < height; row++) {
            matrix[row] = buildIntsArray(width);
        }
        return matrix;
    }

    public static int[][] buildNotNegativeIntsMatrix(int height, int width) {
        int[][] matrix = new int[height][];

        for (int row = 0; row < height; row++) {
            matrix[row] = buildNotNegativeIntsArray(width);
        }
        return matrix;
    }

    public static int[][] buildSquareMatrix(int size) {
        return buildIntsMatrix(size, size);
    }

    public static void print(int[] arr) {
        for (int value : arr) {
            System.out.printf("%3d ", value);
        }
        System.out.println();
    }

    public static void print(double[] arr) {
        for (double value : arr) {
            System.out.printf("%7.2f", value);
        }
        System.out.println();
    }

    public static void print(int[][] matrix) {
        for (int[] arr : matrix) {
            print(arr);
        }
    }

    public static void print(double[][] matrix) {
        for (double[] arr : matrix) {
            print(arr);
        }
    }

    public static int getInt() {
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Enter an integer");
        }
        return in.nextInt();
    }

    public static int getPositiveInt() {
        int n;

        do {
            n = getInt();

            if (n <= 0) {
                System.out.println("Enter a positive integer");
            }
        } while (n <= 0);
        return n;
    }

    public static double getDouble() {
        while (!in.hasNextDouble()) {
            in.next();
            System.out.println("Enter a real number");
        }
        return in.nextDouble();
    }

    public static int getRandomInt(int bound) {
        return r.nextInt(bound);
    }
}