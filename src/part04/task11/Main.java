package part04.task11;

import static interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        int a = getPositiveInt();
        int b = getPositiveInt();
        int compareResult = compareByNumberOfDigits(a, b);

        if (compareResult == -1) {
            System.out.println(b + " has more digits");
        } else if (compareResult == 1) {
            System.out.println(a + " has more digits");
        } else {
            System.out.println("Both numbers have the same number of digits");
        }
    }

    private static int compareByNumberOfDigits(int a, int b) {
        int l1 = part04.task10.Main.calculateNumberLength(a);
        int l2 = part04.task10.Main.calculateNumberLength(b);
        return Integer.compare(l1, l2);
    }
}