package part04.task15;

import static cleaner.Cleaner.getNaturalNumberFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter n");
        int n = getNaturalNumberFromUser();

        if (n > 9) {
            print("No numbers");
        } else {
            int min = calculateMin(n);
            int max = calculateMax(n);
            int current = min;
            while (current <= max) {
                print("" + current);
                current = getNext(current);
            }
            // System.out.println(min + " " + max);
        }
    }

    private static int calculateMin(int length) {
        if (length == 1) {
            return 1;
        } else {
            return 10 * calculateMin(length - 1) + length;
        }
    }

    private static int calculateMax(int length) {
        int max = 0;

        for (int i = 0; i < length; i++) {
            max += (9 - i) * Math.pow(10, i);
        }
        return max;
    }

    private static int getNext(int n) {
        for (int i = 1; ; i = i * 10 + 1) {
            if ((n + i) % 10 != 0) {
                return n + i;
            }
        }
    }

}
