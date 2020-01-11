package part04.task13;

import static cleaner.Cleaner.getNaturalNumberFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter initial number");
        int n = getNaturalNumberFromUser();
        print("Your interval is [" + n + ";" + 2 * n + "]");
        print("Twin primes:");
        printTwinPrimes(n);
    }

    /**
     * Prints twin primes in [n;2n] interval
     * Wikipedia says, that twin primes except 3 and 5 equal 6n +- 1
     *
     * @param n start number
     */
    private static void printTwinPrimes(int n) {
        if (n == 3) {
            print("3 5");
        } else {
            int low = n + 1;
            low = low % 6 == 0 ? low : (low / 6 + 1) * 6;
            int high = 2 * n - 1;

            for (int i = low; i < high; i += 6) {
                if (isPrime(i - 1)) {
                    if (isPrime(i + 1)) {
                        print((i - 1) + " " + (i + 1));
                    }
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
