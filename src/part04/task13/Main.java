package part04.task13;

import static interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        int from;

        System.out.println("Enter the first number");
        from = getPositiveInt();
        System.out.printf("Twin primes in the interval [%d;%d]%n", from, from * 2);
        printTwinPrimes(from);
    }

    private static void printTwinPrimes(int n) {
        if (n == 3) {
            System.out.println("3 5");
        } else {
            int low = ((n + 1) % 6 == 0) ? (n + 1) : ((n + 1) / 6 * 6 + 6);
            int high = 2 * n - 1;
            int twinStep = 6;

            for (int i = low; i < high; i += twinStep) {
                if (isPrime(i - 1) && isPrime(i + 1)) {
                    System.out.printf("%d %d%n", i - 1, i + 1);
                }
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}