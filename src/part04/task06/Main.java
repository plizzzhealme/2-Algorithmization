package part04.task06;

import static cleaner.Cleaner.getNaturalNumberFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter 3 integers");
        int n = 3;
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = getNaturalNumberFromUser();
        }

        print(isCoPrime(numbers) ? "co-prime" : "not co-prime");
    }

    private static boolean isCoPrime(int[] numbers) {
        return part04.task02.Main.calculateMultipleGcd(numbers) == 1;
    }
}
