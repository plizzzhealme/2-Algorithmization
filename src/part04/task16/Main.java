package part04.task16;

import static interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number's length");
        int length = getPositiveInt();
        long oddSum = calculateOddSum(length);
        System.out.println("Odd sum: " + oddSum);
        System.out.println("Even sum: " + calculateEvenDigitsSum(oddSum));
    }

    private static long calculateOddSum(int length) {
        return (long) Math.pow(5, length) * calculateAverageValue(length);
    }

    private static int calculateAverageValue(int length) {
        int result = 0;

        for (int i = 0; i < length; i++) {
            result += 5 * Math.pow(10, i);
        }
        return result;
    }

    private static int calculateEvenDigitsSum(long n) {
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