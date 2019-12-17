package arrays.task04;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter array size");

        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        double[] array = new double[arrayLength];
        int bound = 42;
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextDouble() * bound * 2 - bound;
        }

        System.out.println("Initial array:");

        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("%.2f ", array[i]);
        }

        System.out.println();

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < arrayLength; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            } else if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
        }

        double temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        System.out.println("Final array:");

        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("%.2f ", array[i]);
        }
    }
}