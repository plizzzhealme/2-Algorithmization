package part04.task06;

import static interaction.Interaction.getPositiveInt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 3 integers");
        int n = 3;
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = getPositiveInt();
        }
        System.out.println(isCoPrime(numbers) ? "co-prime" : "not co-prime");
    }

    /*
    use the method from the previous task
     */
    private static boolean isCoPrime(int[] numbers) {
        return part04.task02.Main.calculateMultipleGcd(numbers) == 1;
    }
}
