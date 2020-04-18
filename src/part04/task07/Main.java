package part04.task07;

public class Main {
    public static void main(String[] args) {
        int n = 9;
        int sum = calcOddFacSum(n);

        System.out.printf("Sum = %d", sum);
    }

    private static int calcOddFacSum(int n) {
        int sum = 0;
        int fac = 1;

        for (int i = 1; i <= n; i++) {
            fac *= i;

            if (i % 2 == 1) {
                sum += fac;
            }
        }
        return sum;
    }
}