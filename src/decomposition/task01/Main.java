package decomposition.task01;

import static cleaner.Cleaner.getIntFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter 2 integers");
        int a = getIntFromUser();
        int b = getIntFromUser();
        int gcd = calculateGcd(a, b);
        int lcm = calculateLcm(a, b);
        print("Greatest common divisor: " + gcd);
        print("Less common multiple: " + lcm);
    }

    private static int calculateGcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGcd(b, a % b);
    }

    private static int calculateLcm(int a, int b) {
        int gcd = calculateGcd(a, b);
        return a * b / gcd;
    }
}
