package part03.task02;

import java.util.Random;

import static interaction.Interaction.getPositiveInt;
import static interaction.Interaction.print;

public class Main {
    private static final Random r = new Random();

    public static void main(String[] args) {
        int length1;
        int length2;
        int[] arr1;
        int[] arr2;
        int[] arr;

        System.out.println("Enter arrays lengths");
        length1 = getPositiveInt();
        length2 = getPositiveInt();
        arr1 = buildArray(length1);
        arr2 = buildArray(length2);
        System.out.println("Initial arrays:");
        print(arr1);
        print(arr2);
        arr = merge(arr1, arr2);
        System.out.println("Final array:");
        print(arr);
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int length1 = arr1.length;
        int length2 = arr2.length;
        int[] arr = new int[length1 + length2];
        int i1 = 0;
        int i2 = 0;

        while (i1 < length1 || i2 < length2) {
            if (i1 == length1) {
                while (i2 < length2) {
                    arr[i1 + i2] = arr2[i2];
                    i2++;
                }
            } else if (i2 == length2) {
                while (i1 < length1) {
                    arr[i1 + i2] = arr1[i1];
                    i1++;
                }
            } else if (arr1[i1] < arr2[i2]) {
                arr[i1 + i2] = arr1[i1];
                i1++;
            } else {
                arr[i1 + i2] = arr2[i2];
                i2++;
            }
        }
        return arr;
    }

    private static int[] buildArray(int length) {
        int bound = 13;
        int[] arr = new int[length];
        arr[0] = r.nextInt(bound);

        for (int i = 1; i < length; i++) {
            arr[i] = arr[i - 1] + r.nextInt(bound);
        }
        return arr;
    }
}