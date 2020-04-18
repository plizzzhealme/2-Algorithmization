package part04.task11;

import static interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int compareResult;

        System.out.println("Enter 2 numbers");
        a = getPositiveInt();
        b = getPositiveInt();
        compareResult = compareByNumberOfDigits(a, b);

        if (compareResult == -1) {
            System.out.printf("%d has more digits", b);
        } else if (compareResult == 1) {
            System.out.printf("%d has more digits", a);
        } else {
            System.out.println("Both numbers have the same number of digits");
        }
    }

    private static int compareByNumberOfDigits(int a, int b) {
        int l1 = part04.task10.Main.calcNumberLength(a);
        int l2 = part04.task10.Main.calcNumberLength(b);
        return Integer.compare(l1, l2);
    }
}