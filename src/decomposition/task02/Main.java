package decomposition.task02;

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

        int gcd = calculateGcd(numbers);
        print("Greatest common divisor: " + gcd);
    }


    private static int calculateGcd(int[] numbers) {
        int length = numbers.length;
        int gcd = decomposition.task01.Main.calculateGcd(numbers[0], numbers[1]);

        for (int i = 2; i < length; i++) {
            gcd = decomposition.task01.Main.calculateGcd(gcd, numbers[i]);
        }

        return gcd;
    }

}
