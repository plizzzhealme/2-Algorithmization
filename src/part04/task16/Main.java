package part04.task16;

import static interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        int length;
        long oddNumbersSum;
        int evenDigitsSum;

        System.out.println("Enter number's length");
        length = getPositiveInt();
        oddNumbersSum = calcOddSum(length);
        evenDigitsSum = calcEvenDigitsSum(oddNumbersSum);
        System.out.printf("Odd sum = %d%n", oddNumbersSum);
        System.out.printf("Even sum = %d", evenDigitsSum);
    }

    private static long calcOddSum(int length) {
        int average = 0;

        for (int i = 0; i < length; i++) {
            average += 5 * Math.pow(10, i);
        }
        return (long) Math.pow(5, length) * average;
    }

    private static int calcEvenDigitsSum(long n) {
        int sum = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                sum += n % 10;
            }
            n /= 10;
        }
        return sum;
    }
}