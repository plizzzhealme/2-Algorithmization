package part04.task17;

import static interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter positive integer:");
        int n = getPositiveInt();
        int count = countSubtraction(n);
        System.out.printf("You have to subtract %d time%s", count, count == 1 ? "" : "s");

    }

    /*
    Uses the method from the previous task
     */
    private static int countSubtraction(int n) {
        int count = 0;
        int remainder = n;

        while (remainder != 0) {
            count++;
            remainder -= part04.task12.Main.calculateDigitsSum(remainder);
        }
        return count;
    }
}