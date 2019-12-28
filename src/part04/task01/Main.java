package part04.task01;

import static cleaner.Cleaner.getNaturalNumberFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter 2 integers");
        int a = getNaturalNumberFromUser();
        int b = getNaturalNumberFromUser();
        int gcd = calculateGcd(a, b);
        int lcm = calculateLcm(gcd, a, b);
        print("Greatest common divisor: " + gcd);
        print("Less common multiple: " + lcm);
    }

    public static int calculateGcd(int a, int b) {
        return b == 0 ? a : calculateGcd(b, a % b);
    }

    private static int calculateLcm(int gcd, int a, int b) {
        return a / gcd * b;
    }
}