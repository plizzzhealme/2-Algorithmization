package part04.task07;

import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Sum = " + calculateFacSum());
    }

    private static int calculateFacSum() {
        int sum = 0;
        int fac = 1;

        for (int i = 1; i <= 9; i++) {
            fac *= i;
            sum += fac;
        }

        return sum;
    }
}