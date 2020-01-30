package part04.task10;

import static cleaner.Cleaner.getNaturalNumberFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter natural number");
        int n = getNaturalNumberFromUser();
        print(convertNumberToArray(n));
    }

    private static int[] convertNumberToArray(int n) {
        int length = calculateNumberLength(n);
        int[] number = new int[length];
        int remainder = n;

        for (int i = length - 1; i >= 0; i--) {
            number[i] = remainder % 10;
            remainder /= 10;
        }
        return number;
    }

    public static int calculateNumberLength(int n) {
        int[] sizeTable = {9, 99, 999, 9999, 99999, 999999, 9999999,
                99999999, 999999999, Integer.MAX_VALUE};

        for (int i = 0; ; i++) {
            if (n <= sizeTable[i]) {
                return i + 1;
            }
        }
    }
}