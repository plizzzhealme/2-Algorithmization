package part01.task02;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        double[] arr;
        int length;
        int replacementCount;
        double z;

        System.out.println("Enter array length");
        length = getPositiveInt();
        arr = buildDoublesArray(length);
        System.out.println("Initial array:");
        print(arr);
        System.out.println("Enter Z");
        z = getDouble();
        replacementCount = replaceLargerElements(arr, z);
        System.out.printf("%d numbers have been replaced by Z = %.3f%n", replacementCount, z);
        System.out.println("Final array:");
        print(arr);
    }

    private static int replaceLargerElements(double[] arr, double z) {
        int replacementCount = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            if (arr[i] > z) {
                arr[i] = z;
                replacementCount++;
            }
        }
        return replacementCount;
    }
}