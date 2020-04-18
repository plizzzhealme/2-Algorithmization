package part04.task02;

import static interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        int n = 4;
        int[] numbers = new int[n];
        int gcd;

        System.out.println("Enter 4 integers");

        for (int i = 0; i < n; i++) {
            numbers[i] = getPositiveInt();
        }
        gcd = calculateMultipleGcd(numbers);
        System.out.println("Greatest common divisor: " + gcd);
    }

    public static int calculateMultipleGcd(int[] numbers) {
        int gcd = 1;

        for (int value : numbers) {
            gcd = calcGcd(gcd, value);
        }
        return gcd;
    }

    private static int calcGcd(int a, int b) {
        return b == 0 ? a : calcGcd(b, a % b);
    }
}