package part04.task11;

import static cleaner.Cleaner.getNaturalNumberFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter 2 numbers");

        int a = getNaturalNumberFromUser();
        int b = getNaturalNumberFromUser();
        int compareResult = compareByNumberOfDigits(a, b);

        switch (compareResult) {
            case -1:
                print(b + " has more digits");
                break;
            case 0:
                print("Both numbers have the same number of digits");
                break;
            case 1:
                print(a + " has more digits");
                break;
        }

    }

    private static int compareByNumberOfDigits(int a, int b) {
        int l1 = part04.task10.Main.calculateNumberLength(a);
        int l2 = part04.task10.Main.calculateNumberLength(b);
        return Integer.compare(l1, l2);
    }
}
