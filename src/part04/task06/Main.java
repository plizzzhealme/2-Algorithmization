package part04.task06;

import static cleaner.Cleaner.getIntFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter 3 integers");
        int a = getIntFromUser();
        int b = getIntFromUser();
        int c = getIntFromUser();
        print(isCoPrime(a, b, c) ? "co-prime" : "not co-prime");
    }

    private static boolean isCoPrime(int a, int b, int c) {
        int gcd = part04.task01.Main.calculateGcd(a, b);
        if (gcd == 1) {
            return true;
        }
        gcd = part04.task01.Main.calculateGcd(gcd, c);
        return gcd == 1;
    }
}
