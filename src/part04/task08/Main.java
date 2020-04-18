package part04.task08;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int k;
        int m;
        int length;
        int[] arr;

        System.out.println("Enter array length");
        length = getInt();
        arr = buildIntsArray(length);
        System.out.println("Initial array:");
        print(arr);
        System.out.println("Enter the interval");
        k = getPositiveInt();
        m = getPositiveInt();

        if (m <= arr.length && k <= m - 2) {
            System.out.println("Sums:");
            printSums(arr, k - 1, m - 1);
        } else {
            System.out.println("Incorrect interval");
        }
    }

    private static void printSums(int[] arr, int from, int to) {
        for (int i = from; i <= to - 2; i++) {
            int sum = tripletSum(arr, i);
            System.out.println(sum);
        }
    }

    private static int tripletSum(int[] arr, int from) {
        return arr[from] + arr[from + 1] + arr[from + 2];
    }
}