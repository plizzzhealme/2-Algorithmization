package part04.task08;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter array length");
        int length = getInt();
        int[] array = buildPositiveIntsArray(length);
        System.out.println("Initial array:");
        print(array);
        System.out.println("Enter the number of the first element to calculate the sum");
        int n = getPositiveInt();
        int index = n - 1;

        if (checkIndex(array, index)) {
            System.out.println("Sum = " + threeSum(array, index));
        } else {
            System.out.println("Index too large or array too small");
        }
    }

    private static int threeSum(int[] array, int startIndex) {
        return array[startIndex] + array[startIndex + 1] + array[startIndex + 2];
    }

    private static boolean checkIndex(int[] array, int index) {
        int length = array.length;
        return index + 2 < length;
    }
}