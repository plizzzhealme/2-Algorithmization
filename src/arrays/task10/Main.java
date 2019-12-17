package arrays.task10;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter array length");

        Scanner in = new Scanner(System.in);
        int arrayLength = in.nextInt();
        int[] array = new int[arrayLength];
        int bound = 10;
        Random random = new Random();

        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(bound * 2) - bound;
        }

        System.out.println("Initial array:");

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int subArrayLength = arrayLength / 2;

        if (arrayLength % 2 == 1) {
            subArrayLength++;
        }

        for (int i = 1; i < subArrayLength; i++) {
            array[i] = array[i * 2];
        }

        for (int i = subArrayLength; i < arrayLength; i++) {
            array[i] = 0;
        }

        System.out.println("Final array:");

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
