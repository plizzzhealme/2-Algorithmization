package part01.task04;

import static interaction.Interaction.*;

public class Main {
    public static void main(String[] args) {
        int length;
        double[] arr;

        System.out.println("Enter array length");
        length = getPositiveInt();
        arr = buildDoublesArray(length);
        System.out.println("Initial array:");
        print(arr);
        swapMinMax(arr);
        System.out.println("Final array:");
        print(arr);
    }

    private static void swapMinMax(double[] arr) {
        int length = arr.length;
        int minIndex = 0;
        int maxIndex = 0;
        double temp;

        for (int i = 0; i < length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            } else if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}