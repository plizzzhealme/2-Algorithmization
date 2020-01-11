package part04.task14;

import static cleaner.Cleaner.getNaturalNumberFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter positive integer");
        int bound = getNaturalNumberFromUser();
        print("Armstrong numbers from 1 to " + bound + ":");
        printArmstrongNumbers(bound);
    }

    private static void printArmstrongNumbers(int k) {
        for (int i = 1; i <= k; i++) {
            int sum = calculateDigitsSum(i);
            int l = part04.task10.Main.calculateNumberLength(i);
            if (pow(sum, l) == i) {
                print("" + i);
            }
        }
    }

    private static int calculateDigitsSum(int n) {
        int sum = 0;
        int remainder = n;

        while (remainder != 0) {
            sum += remainder % 10;
            remainder /= 10;
        }

        return sum;
    }

    private static int pow(int base, int exponent) {
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
