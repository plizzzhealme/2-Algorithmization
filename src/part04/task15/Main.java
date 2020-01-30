package part04.task15;

import static cleaner.Cleaner.getNaturalNumberFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter number's length");
        int length = getNaturalNumberFromUser();

        if (length > 9 || length < 1) {
            print("Empty set");
        } else {
            int n = calculateMin(length);
            int[] number = convertNumberToArray(n, length);
            System.out.println(n);

            while (hasNextSet(number)) {
                getNextSet(number);
                n = convertArrayToNumber(number);
                System.out.println(n);
            }
        }
    }

    private static int calculateMin(int length) {
        if (length == 1) {
            return 1;
        } else {
            return 10 * calculateMin(length - 1) + length;
        }
    }

    private static int[] convertNumberToArray(int n, int length) {
        int[] number = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            number[i] = n % 10;
            n /= 10;
        }
        return number;
    }

    private static int convertArrayToNumber(int[] number) {
        int l = number.length;
        int n = 0;

        for (int i = 0; i < l; i++) {
            n += number[i] * Math.pow(10, l - i - 1);
        }
        return n;
    }

    private static boolean hasNextSet(int[] number) {
        return number[0] < 10 - number.length;
    }

    private static void getNextSet(int[] number) {
        int l = number.length;
        boolean changed = false;
        int i = l - 1;

        while (!changed && i >= 0) {
            int maxValue = 10 - l + i;

            if (number[i] < maxValue) {
                number[i]++;

                for (int j = i + 1; j < l; j++) {
                    number[j] = number[j - 1] + 1;
                }
                changed = true;
            }
            i--;
        }
    }
}