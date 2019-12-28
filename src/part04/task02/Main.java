package part04.task02;

import static cleaner.Cleaner.getNaturalNumberFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter 4 integers");

        int length = 4;
        int[] numbers = new int[4];

        for (int i = 0; i < length; i++) {
            numbers[i] = getNaturalNumberFromUser();
        }

        int gcd = calculateMultipleGcd(numbers);
        print("Greatest common divisor: " + gcd);
    }


    public static int calculateMultipleGcd(int[] numbers) {
        int length = numbers.length;
        int gcd = part04.task01.Main.calculateGcd(numbers[0], numbers[1]);

        for (int i = 2; i < length; i++) {
            gcd = part04.task01.Main.calculateGcd(gcd, numbers[i]);
        }

        return gcd;
    }

}
