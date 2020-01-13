package part04.task17;

import static cleaner.Cleaner.getNaturalNumberFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter positive integer:");
        int n = getNaturalNumberFromUser();
        int count = countSubtraction(n);
        System.out.printf("You have to subtract %d time%s", count, n < 10 ? "" : "s");

    }

    private static int countSubtraction(int n) {
        int count = 0;
        int remainder = n;

        while (remainder != 0) {
            count++;
            remainder -= part04.task12.Main.calculateDigitsSum(remainder);
        }
        return count;
    }
}
