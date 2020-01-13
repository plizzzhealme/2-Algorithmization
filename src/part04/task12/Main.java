package part04.task12;

import static cleaner.Cleaner.getNaturalNumberFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter 2 natural numbers");
        int k = getNaturalNumberFromUser();
        int n = getNaturalNumberFromUser();
        print("Numbers from 1 to " + n + " with one incredible property:");
        print(buildThisStupidArray(k, n));
    }

    private static int[] buildThisStupidArray(int k, int n) {
        int length = countStupidNumbers(k, n);
        int[] array = new int[length];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (calculateDigitsSum(i) == k) {
                array[index] = i;
                index++;
            }
        }
        return array;
    }

    private static int countStupidNumbers(int k, int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (calculateDigitsSum(i) == k) {
                count++;
            }
        }
        return count;
    }

    public static int calculateDigitsSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}