package part04.task12;

import static interaction.Interaction.getPositiveInt;
import static interaction.Interaction.print;

public class Main {
    public static void main(String[] args) {
        int k;
        int n;
        int[] arr;

        System.out.println("Enter 2 positive integers");
        k = getPositiveInt();
        n = getPositiveInt();
        System.out.printf("Numbers from 1 to %d with digits sum = %d:%n", n, k);
        arr = buildArray(k, n);
        print(arr);
    }

    private static int[] buildArray(int k, int n) {
        int length = calcLength(k, n);
        int[] arr = new int[length];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (calcDigitsSum(i) == k) {
                arr[index] = i;
                index++;
            }
        }
        return arr;
    }

    private static int calcLength(int k, int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (calcDigitsSum(i) == k) {
                count++;
            }
        }
        return count;
    }

    public static int calcDigitsSum(int n) {
        int temp = Math.abs(n);
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}